package com.hackthealps.paylocal.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hackthealps.paylocal.BuildConfig;
import com.hackthealps.paylocal.api.AccommodationApi;
import com.hackthealps.paylocal.model.AccommodationModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AccommodationRepository {

    private AccommodationApi accommodationApi;
    private static AccommodationRepository accommodationRepository;

    private AccommodationRepository() {

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.backendBaseUrl)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            accommodationApi = retrofit.create(AccommodationApi.class);
    }

    public synchronized static AccommodationRepository getInstance() {
        if (accommodationRepository == null) {
            if (accommodationRepository == null) {
                accommodationRepository = new AccommodationRepository();
            }
        }
        return accommodationRepository;
    }

    public LiveData<List<AccommodationModel>> getAccommodations() {
        final MutableLiveData<List<AccommodationModel>> data = new MutableLiveData<>();

        accommodationApi.getAllAccommodations().enqueue(new Callback<List<AccommodationModel>>() {
            @Override
            public void onResponse(Call<List<AccommodationModel>> call, Response<List<AccommodationModel>> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<AccommodationModel>> call, Throwable t) {
                data.setValue(null);
            }
        });

        return data;
    }
}