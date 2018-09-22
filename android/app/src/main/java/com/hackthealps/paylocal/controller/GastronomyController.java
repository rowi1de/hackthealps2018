package com.hackthealps.paylocal.controller;

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

public class GastronomyController implements Callback<List<GastronomyModel>> {

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.backendBaseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        GastronomyApi gastronomyApi = retrofit.create(GastronomyApi.class);

        Call<List<GastronomyModel>> call = gastronomyApi.getAllGastronomy();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<GastronomyModel>> call, Response<List<GastronomyModel>> response) {
        if(response.isSuccessful()) {
            List<GastronomyModel> eventsList = response.body();
            for(GastronomyModel event : eventsList) {
                System.out.println(event);
            }
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<List<GastronomyModel>> call, Throwable t) {
        t.printStackTrace();
    }
}
