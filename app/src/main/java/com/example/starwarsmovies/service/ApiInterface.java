package com.example.starwarsmovies.service;

import com.example.starwarsmovies.models.Films;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

        @GET("people/")
        Call<Films> getFilms();
}
