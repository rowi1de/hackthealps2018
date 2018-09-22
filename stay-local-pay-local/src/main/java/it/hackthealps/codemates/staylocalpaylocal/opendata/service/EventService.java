package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import static java.util.stream.Collectors.toList;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

import it.hackthealps.codemates.staylocalpaylocal.opendata.api.EventApi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.api.GastronomyApi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Event;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventResult;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Gastronomy;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyResult;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.AccommodationRepository;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EventService {

    private final EventApi eventApi;

    private final EventRepository repository;


    @Transactional
    public void importEvents() {
        EventResult result = eventApi.eventGetEvents(1, 100,
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

        final List<EventModel> items =
                result.getItems().stream().map(item -> EventModel.builder()
                        .title(item.getShortname())
                        .latitude(item.getLatitude())
                        .longitude(item.getLongitude()).build())
                        .collect(toList());

        repository.saveAll(items);
    }
}
