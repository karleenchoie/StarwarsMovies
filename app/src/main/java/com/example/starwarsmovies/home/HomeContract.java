package com.example.starwarsmovies.home;

import com.example.starwarsmovies.models.Films;

import java.util.ArrayList;

public interface HomeContract {

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
