package com.example.starwarsmovies.service;

import com.example.starwarsmovies.models.Films;
import com.example.starwarsmovies.models.FilmsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

        @GET("films/")
        Call<FilmsResponse> getAllFilms();

        @GET("films/{id}/")
        Call<Films> getFilm(@Path("id") long id);
}
