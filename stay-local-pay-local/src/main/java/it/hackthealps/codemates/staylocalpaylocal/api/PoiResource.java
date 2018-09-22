package it.hackthealps.codemates.staylocalpaylocal.api;


import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GastronomyModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.PoiModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.service.GastronomyService;
import it.hackthealps.codemates.staylocalpaylocal.opendata.service.PoiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("POI")
@RequiredArgsConstructor
public class PoiResource {

    private final PoiService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PoiModel> getAllPoi() {
        return service.getAllPoi();
    }
}
