package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import javax.transaction.Transactional;
import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.api.AccommodationApi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationResult;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ScoreValue;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.AccommodationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccommodationService {

    private final AccommodationApi accommodationApi;

    private final AccommodationRepository repository;

    private final ScoreService scoreService;

    @Transactional
    public void importAccommodations() {
        AccommodationResult result = accommodationApi.accommodationGetAccommodations(1, 100,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "50.18424",
                "8.5232",
                "100");
        final List<AccommodationModel> items =
                result.getItems().stream()
                        .filter(item -> item.getFeatures() != null)
                        .map(item -> AccommodationModel.builder()
                        .title(item.getShortname())
                                .scoreModel(scoreService.score(item))
                        .latitude(item.getLatitude())
                        .longitude(item.getLongitude()).build())
                        .filter(item -> item.getScoreModel().getScoreValue() != ScoreValue.ZERO_STAR)
                        .collect(toList());

        repository.saveAll(items);
        repository.flush();
    }

    @Transactional
    public List<AccommodationModel> getAllAccommodations() {
        return repository.findAll()
                .stream()
                .sorted(comparing(AccommodationModel::getScoreModel))
                .collect(toList());
    }
}
