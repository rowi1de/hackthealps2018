package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import javax.transaction.Transactional;
import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.api.EventApi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventResult;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ScoreValue;
import it.hackthealps.codemates.staylocalpaylocal.opendata.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EventService {

    private final EventApi eventApi;

    private final EventRepository repository;

    private final ScoreService scoreService;


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
                result.getItems().stream()
                        .filter(item -> item.getDistrictIds() != null)
                        .map(item -> EventModel.builder()
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
    public List<EventModel> getAllEvents() {
        return repository.findAll()
                .stream()
                .sorted(comparing(EventModel::getScoreModel))
                .collect(toList());
    }
}
