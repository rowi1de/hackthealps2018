package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OpenDataImportService implements CommandLineRunner {

    private final LoginService loginService;

    private final AccommodationService accommodationService;

    private final EventService eventService;

    private final GastronomyService gastronomyService;

    @Override
    public void run(String... strings) {
        loginService.login();
        accommodationService.importAccommodations();
        eventService.importEvents();
        gastronomyService.importGastronomy();
    }
}