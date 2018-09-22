package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import static java.util.stream.Collectors.toList;

import javax.transaction.Transactional;
import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.api.GastronomyApi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyResult;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.GastronomyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GastronomyService {

    private final GastronomyApi gastronomyApi;


    private final GastronomyRepository repository;


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
                result.getItems().stream().map(item -> GastronomyModel.builder()
                        .title(item.getShortname())
                        .latitude(item.getLatitude())
                        .longitude(item.getLongitude()).build())
                        .collect(toList());

        repository.saveAll(items);
    }
}
