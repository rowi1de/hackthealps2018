package com.hackthealps.paylocal.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hackthealps.paylocal.BuildConfig;
import com.hackthealps.paylocal.api.PoiApi;
import com.hackthealps.paylocal.model.AccommodationModel;
import com.hackthealps.paylocal.model.PoiModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PoiRepository {

    private PoiApi poiApi;
    private static PoiRepository accommodationRepository;

    private PoiRepository() {

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.backendBaseUrl)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            poiApi = retrofit.create(PoiApi.class);
    }

    public synchronized static PoiRepository getInstance() {
        if (accommodationRepository == null) {
            if (accommodationRepository == null) {
                accommodationRepository = new PoiRepository();
            }
        }
        return accommodationRepository;
    }

    public LiveData<List<AccommodationModel>> getPOI() {
        final MutableLiveData<List<PoiModel>> data = new MutableLiveData<>();

        poiApi.getAllPoi().enqueue(new Callback<List<PoiModel>>() {
            @Override
            public void onResponse(Call<List<PoiModel>> call, Response<List<PoiModel>> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<PoiModel>> call, Throwable t) {
                data.setValue(null);
            }
        });

        return data;
    }
}