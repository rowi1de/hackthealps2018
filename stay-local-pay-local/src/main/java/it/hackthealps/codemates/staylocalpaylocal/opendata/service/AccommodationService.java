package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import javax.transaction.Transactional;
import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.api.AccommodationApi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Accommodation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccommodationService {

    private final AccommodationApi accommodationApi;


    @Transactional
    public void importAccommodations() {
        List<Accommodation> results = accommodationApi.accommodationGetAccommodations(1, 100,
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
                null,
                null,
                null,
                null,
                null,
                null,
                "50.18424",
                "8.5232",
                "100");
    }
}
