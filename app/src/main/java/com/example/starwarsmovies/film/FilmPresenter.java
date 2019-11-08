package com.example.starwarsmovies.film;

import android.util.Log;

import com.example.starwarsmovies.models.Films;
import com.example.starwarsmovies.service.ApiClient;
import com.example.starwarsmovies.service.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class FilmPresenter implements FilmContract.FilmPresenter {
    int id;
    FilmContract.FilmView view;
    ApiInterface api;

    FilmPresenter(int id,FilmContract.FilmView view)
    {
        this.id = id;
        this.view = view;
    }
    @Override
    public void getFilm() {
        view.showLoading();
        api = ApiClient.getStarWarsApi();
        Log.i(TAG, "getFilm: " + id);
        api.getFilm(id).enqueue(new Callback<Films>() {
            @Override
            public void onResponse(Call<Films> call, Response<Films> response) {
                Films film =  response.body();
                view.showTitle(film.getTitle());
                view.showReleaseDate(film.getRelease_date());
                view.showMessage("Film Loaded!");
                view.hideLoading();
            }

            @Override
            public void onFailure(Call<Films> call, Throwable t) {
                view.hideLoading();
                view.showMessage(t.getMessage());
            }
        });
    }
}