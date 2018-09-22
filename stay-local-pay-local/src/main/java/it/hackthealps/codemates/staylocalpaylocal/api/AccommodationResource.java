package it.hackthealps.codemates.staylocalpaylocal.api;


import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccommodationModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.service.AccommodationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("Accommodations")
@RequiredArgsConstructor
public class AccommodationResource {

    private final AccommodationService service;

    @GetMapping
    public List<AccommodationModel> getAllAccommodations() {
        return service.getAllAccommodations();
    }
}
