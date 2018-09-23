package com.hackthealps.paylocal.ui;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.hackthealps.paylocal.model.GastronomyModel;
import com.hackthealps.paylocal.model.PoiModel;
import com.hackthealps.paylocal.repository.GastronomyRepository;
import com.hackthealps.paylocal.repository.PoiRepository;

import java.util.List;

public class POIListViewModel extends AndroidViewModel {
    private final LiveData<List<PoiModel>> poiModelObservable;

    public POIListViewModel(Application application) {
        super(application);

        // If any transformation is needed, this can be simply done by Transformations class ...
        poiModelObservable = PoiRepository.getInstance().getPOI();
    }

    public LiveData<List<PoiModel>> getGastronomyModelObservable() {
        return poiModelObservable;
    }
}