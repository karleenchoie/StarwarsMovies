package com.example.starwarsmovies.home;

import android.util.Log;

import com.example.starwarsmovies.models.Films;
import com.example.starwarsmovies.models.FilmsResponse;
import com.example.starwarsmovies.service.ApiClient;
import com.example.starwarsmovies.service.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class HomePresenter implements HomeContract.HomePresenter {


    private HomeContract.HomeView view;
    private ApiInterface api;

    public HomePresenter(HomeContract.HomeView view)
    {
        this.view  = view;
        api = ApiClient.getStarWarsApi();
        view.showTitle("All Star Wars Film");
    }


    @Override
    public void getAllFilms() {
        view.showLoading();
        api.getAllFilms().enqueue(new Callback<FilmsResponse>() {
            @Override
            public void onResponse(Call<FilmsResponse> call, Response<FilmsResponse> response) {
                Log.i(TAG, "onResponse: Films Loaded Succesfully" );
                view.showAllFilms((ArrayList)response.body().getResults());
                view.hideLoading();

            }

            @Override
            public void onFailure(Call<FilmsResponse> call, Throwable t) {
                view.showMessage(t.getMessage());
                view.hideLoading();
            }
        });
    }

    @Override
    public void onFilmItemClicked(Films film) {
        view.navigateToFilmPage(film);
    }
}
