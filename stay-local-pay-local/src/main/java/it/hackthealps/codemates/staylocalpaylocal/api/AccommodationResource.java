package it.hackthealps.codemates.staylocalpaylocal.api;


import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.service.AccommodationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Accommodations")
@RequiredArgsConstructor
public class AccommodationResource {

    private final AccommodationService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AccommodationModel> getAllAccommodations() {
        return service.getAllAccommodations();
    }
}
