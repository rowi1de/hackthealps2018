package com.hackthealps.paylocal.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hackthealps.paylocal.api.AccommodationApi;
import com.hackthealps.paylocal.model.AccommodationModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AccommodationController implements Callback<List<AccommodationModel>> {

    static final String BASE_URL = "https://f5770c5c.ngrok.io/hta/";

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        AccommodationApi accommodationApi = retrofit.create(AccommodationApi.class);

        Call<List<AccommodationModel>> call = accommodationApi.getAllAccommodations ();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<AccommodationModel>> call, Response<List<AccommodationModel>> response) {
        if(response.isSuccessful()) {
            List<AccommodationModel> eventsList = response.body();
            for(AccommodationModel event : eventsList) {
                System.out.println(event);
            }
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<List<AccommodationModel>> call, Throwable t) {
        t.printStackTrace();
    }
}
