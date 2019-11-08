package com.example.starwarsmovies.film;

public interface FilmContract {
    interface FilmPresenter{

        void getFilm();


    }
    interface FilmView{
        void showLoading();

        void hideLoading();

        void showMessage(String message);

        void showTitle(String title);

        void showReleaseDate(String releaseDate);

    }
}