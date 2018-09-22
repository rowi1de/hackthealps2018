package com.hackthealps.paylocal.api;

import com.hackthealps.paylocal.model.GastronomyModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GastronomyApi {

    @GET("Gastronomy/")
    Call<List<GastronomyModel>> getAllGastronomy();
}