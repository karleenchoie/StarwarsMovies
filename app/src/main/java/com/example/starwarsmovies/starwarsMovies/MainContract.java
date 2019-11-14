package com.example.starwarsmovies.starwarsMovies;

import com.example.starwarsmovies.models.Films;

import java.util.ArrayList;

public interface MainContract {

    interface HomeView{
        void showLoading();

        void hideLoading();

        void showMessage(String message);

        void showTitle(String title);

        void showAllFilms(ArrayList<Films> films);

        void navigateToFilmPage(Films film);

    }
    interface HomePresenter{

        void getAllFilms();

        void onFilmItemClicked(Films film);

    }
}
