package com.hackthealps.paylocal.api;

import com.hackthealps.paylocal.model.GastronomyModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AccommodationApi {

    @GET("Accommodation/")
    Call<List<GastronomyModel>> getAllGastronomy();
}