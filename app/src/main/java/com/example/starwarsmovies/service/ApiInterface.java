package com.example.starwarsmovies.service;

import com.example.starwarsmovies.models.Films;
import com.example.starwarsmovies.models.FilmsResponse;
import com.example.starwarsmovies.models.Character;
import com.example.starwarsmovies.models.CharacterResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

        //for fetching film lists
        @GET("films/")
        Call<FilmsResponse> getAllFilms();

        @GET("films/{id}/")
        Call<Films> getFilm(@Path("id") long id);

        //for fetching character lists
        @GET("people/")
        Call<CharacterResponse> getAllPeople();

        @GET("people/{id}/")
        Call<Character> getPeople(@Path("id") long id);

        //for fetching planet lists
        @GET("planets/")
        Call<CharacterResponse> getAllPlanets();

        @GET("planets/{id}/")
        Call<Character> getPlanets(@Path("id") long id);
}
