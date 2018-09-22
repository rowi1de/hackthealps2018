package com.hackthealps.paylocal.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hackthealps.paylocal.api.EventApi;
import com.hackthealps.paylocal.model.EventModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EventController implements Callback<List<EventModel>> {

    static final String BASE_URL = "https://f5770c5c.ngrok.io/hta/";

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        EventApi eventApi = retrofit.create(EventApi.class);

        Call<List<EventModel>> call = eventApi.getAllEvents();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<EventModel>> call, Response<List<EventModel>> response) {
        if(response.isSuccessful()) {
            List<EventModel> eventsList = response.body();
            for(EventModel event : eventsList) {
                System.out.println(event);
            }
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<List<EventModel>> call, Throwable t) {
        t.printStackTrace();
    }
}
