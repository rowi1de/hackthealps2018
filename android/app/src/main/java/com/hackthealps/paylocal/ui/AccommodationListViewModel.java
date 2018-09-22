package com.hackthealps.paylocal.ui;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.hackthealps.paylocal.model.AccommodationModel;
import com.hackthealps.paylocal.repository.AccommodationRepository;

import java.util.List;

public class AccommodationListViewModel extends AndroidViewModel {
    private final LiveData<List<AccommodationModel>> accommodationModelObservable;

    public AccommodationListViewModel(Application application) {
        super(application);

        // If any transformation is needed, this can be simply done by Transformations class ...
        accommodationModelObservable = AccommodationRepository.getInstance().getAccommodations();
    }

    public LiveData<List<AccommodationModel>> getAccommodationModelObservable() {
        return accommodationModelObservable;
    }
}