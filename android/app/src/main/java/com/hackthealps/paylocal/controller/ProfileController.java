package com.hackthealps.paylocal.controller;

import com.hackthealps.paylocal.api.ProfileApi;
import com.hackthealps.paylocal.model.UserProfile;
import com.hackthealps.paylocal_reader.api.ProfileApi;
import com.hackthealps.paylocal_reader.model.UserProfile;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ProfileController implements Callback<UserProfile> {
    static final String BASE_URL = "https://f5770c5c.ngrok.io/hta/";

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        ProfileApi profileApi = retrofit.create(ProfileApi.class);

        Call<UserProfile> call = profileApi.getProfile();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<UserProfile> call, Response<UserProfile> response) {
        if(response.isSuccessful()) {
            UserProfile profile = response.body();
            System.out.println(profile);

        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<UserProfile> call, Throwable t) {
        t.printStackTrace();
    }
}
