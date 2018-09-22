package com.hackthealps.paylocal.ui;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.hackthealps.paylocal.repository.EventRepository;
import com.hackthealps.paylocal.model.EventModel;

import java.util.List;

public class EventListViewModel extends AndroidViewModel {
    private final LiveData<List<EventModel>> eventModelObservable;

    public EventListViewModel(Application application) {
        super(application);

        // If any transformation is needed, this can be simply done by Transformations class ...
        eventModelObservable = EventRepository.getInstance().getEvents();
    }

    public LiveData<List<EventModel>> getEventModelObservable() {
        return eventModelObservable;
    }
}