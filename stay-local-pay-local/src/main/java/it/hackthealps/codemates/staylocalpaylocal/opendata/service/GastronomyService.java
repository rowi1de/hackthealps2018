package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import javax.transaction.Transactional;
import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.api.GastronomyApi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyResult;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ScoreValue;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.GastronomyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GastronomyService {

    private final GastronomyApi gastronomyApi;


    private final GastronomyRepository repository;

    private final ScoreService scoreService;


    @Transactional
    public void importGastronomy() {
        GastronomyResult result = gastronomyApi.gastronomyGetGastronomyList(1, 100,
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

        final List<GastronomyModel> items =
                result.getItems().stream()
                        .filter(item -> item.getFacilities() != null)
                        .map(item -> GastronomyModel.builder()
                        .title(item.getShortname())
                        .latitude(item.getLatitude())
                                .scoreModel(scoreService.score(item))
                        .longitude(item.getLongitude()).build())
                        .filter(item -> item.getScoreModel().getScoreValue() != ScoreValue.ZERO_STAR)
                        .collect(toList());

        repository.saveAll(items);
        repository.flush();
    }

    @Transactional
    public List<GastronomyModel> getAllGastronomy() {
        return repository.findAll()
                .stream()
                .sorted(comparing(GastronomyModel::getScoreModel))
                .collect(toList());
    }

}
