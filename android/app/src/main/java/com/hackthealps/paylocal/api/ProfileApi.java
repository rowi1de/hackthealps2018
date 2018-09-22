package com.hackthealps.paylocal.api;

import com.hackthealps.paylocal.model.UserProfile;
import com.hackthealps.paylocal_reader.model.UserProfile;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ProfileApi {
    @GET("profile")
    Call<UserProfile> getProfile();
}
