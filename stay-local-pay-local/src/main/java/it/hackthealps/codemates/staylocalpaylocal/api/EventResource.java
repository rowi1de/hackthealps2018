package it.hackthealps.codemates.staylocalpaylocal.api;


import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.EventModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Events")
@RequiredArgsConstructor
public class EventResource {

    private final EventService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EventModel> getAllEvents() {
        return service.getAllEvents();
    }
}
