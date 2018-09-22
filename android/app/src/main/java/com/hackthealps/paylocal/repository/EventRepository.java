package com.hackthealps.paylocal.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hackthealps.paylocal.BuildConfig;
import com.hackthealps.paylocal.api.EventApi;
import com.hackthealps.paylocal.model.EventModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EventRepository {

    private EventApi eventApi;
    private static EventRepository eventRepository;

    private EventRepository() {

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.backendBaseUrl)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            eventApi = retrofit.create(EventApi.class);
    }

    public synchronized static EventRepository getInstance() {
        if (eventRepository == null) {
            if (eventRepository == null) {
                eventRepository = new EventRepository();
            }
        }
        return eventRepository;
    }

    public LiveData<List<EventModel>> getEvents() {
        final MutableLiveData<List<EventModel>> data = new MutableLiveData<>();

        eventApi.getAllEvents().enqueue(new Callback<List<EventModel>>() {
            @Override
            public void onResponse(Call<List<EventModel>> call, Response<List<EventModel>> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<EventModel>> call, Throwable t) {
                data.setValue(null);
            }
        });

        return data;
    }
}