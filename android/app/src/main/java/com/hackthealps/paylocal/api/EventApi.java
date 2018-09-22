package com.hackthealps.paylocal.api;

import com.hackthealps.paylocal.model.EventModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EventApi {

    @GET("Events/")
    Call<List<EventModel>> getAllEvents();
}