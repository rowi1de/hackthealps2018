package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import javax.transaction.Transactional;
import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.api.PoiApi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.PoiModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.PoiResult;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.PoiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PoiService {

    private final PoiApi poiApi;

    private final ScoreService scoreService;

    private final PoiRepository repository;

    @Transactional
    public void importPoi() {
        PoiResult result = poiApi.poiGetPoiFiltered(1, 100,
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
                "200");
        final List<PoiModel> items =
                result.getItems().stream()
                        .filter(item -> item.getSubType() != null)
                        .map(item -> PoiModel.builder()
                                .title(item.getShortname()).scoreModel(scoreService.score(item))
                                .latitude(50.18424)
                                .longitude(8.5232).build())
                        .collect(toList());

        repository.saveAll(items);
        repository.flush();
    }

    @Transactional
    public List<PoiModel> getAllPoi() {
        return repository.findAll()
                .stream()
                .sorted(comparing(PoiModel::getScoreModel))
                .collect(toList());
    }
}
