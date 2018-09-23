package com.hackthealps.paylocal.api;

import com.hackthealps.paylocal.model.PoiModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PoiApi {

    @GET("POI/")
    Call<List<PoiModel>> getAllPoi();
}