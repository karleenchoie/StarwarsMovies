package com.example.starwarsmovies.filmDetails;

import android.util.Log;

import com.example.starwarsmovies.models.Films;
import com.example.starwarsmovies.service.ApiClient;
import com.example.starwarsmovies.service.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class FilmsPresenter implements FilmsContract.FilmPresenter {
    int id;
    FilmsContract.FilmView view;
    ApiInterface api;

    FilmsPresenter(int id, FilmsContract.FilmView view)
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
                view.showDirector(film.getDirector());
                view.showReleaseDate(film.getRelease_date());
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