package com.hackthealps.paylocal.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hackthealps.paylocal.BuildConfig;
import com.hackthealps.paylocal.api.GastronomyApi;
import com.hackthealps.paylocal.model.GastronomyModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GastronomyRepository {

    private GastronomyApi gastronomyApi;
    private static GastronomyRepository gastronomyRepository;

    private GastronomyRepository() {


            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.backendBaseUrl)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

        gastronomyApi = retrofit.create(GastronomyApi.class);


    }

    public synchronized static GastronomyRepository getInstance() {
        if (gastronomyRepository == null) {
            if (gastronomyRepository == null) {
                gastronomyRepository = new GastronomyRepository();
            }
        }
        return gastronomyRepository;
    }

    public LiveData<List<GastronomyModel>> getGastronomy() {
        final MutableLiveData<List<GastronomyModel>> data = new MutableLiveData<>();

        gastronomyApi.getAllGastronomy().enqueue(new Callback<List<GastronomyModel>>() {
            @Override
            public void onResponse(Call<List<GastronomyModel>> call, Response<List<GastronomyModel>> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<GastronomyModel>> call, Throwable t) {
                data.setValue(null);
            }
        });

        return data;
    }
}