package com.hackthealps.paylocal.ui;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.hackthealps.paylocal.model.GastronomyModel;
import com.hackthealps.paylocal.repository.GastronomyRepository;

import java.util.List;

public class GastronomyListViewModel extends AndroidViewModel {
    private final LiveData<List<GastronomyModel>> gastronomyModelObservable;

    public GastronomyListViewModel(Application application) {
        super(application);

        // If any transformation is needed, this can be simply done by Transformations class ...
        gastronomyModelObservable = GastronomyRepository.getInstance().getGastronomy();
    }

    public LiveData<List<GastronomyModel>> getGastronomyModelObservable() {
        return gastronomyModelObservable;
    }
}