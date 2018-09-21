package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import javax.transaction.Transactional;

import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.api.AccommodationApi;
import it.hackthealps.codemates.staylocalpaylocal.api.LoginApiApi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccessTokenModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccessTokenRepository;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Accommodation;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.LoginPostModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccommodationService {

    private final AccommodationApi accommodationApi;


    @Transactional
    public void importAccommodations() {
        List<Accommodation> list =  accommodationApi.accommodationGetAccommodations(1, 100,
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
