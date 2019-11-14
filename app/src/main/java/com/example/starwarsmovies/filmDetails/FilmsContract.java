package com.example.starwarsmovies.filmDetails;

public interface FilmsContract {
    interface FilmView{

        void showLoading();

        void hideLoading();

        void showMessage(String message);

        void showDirector(String director);

        void showTitle(String title);

        void showReleaseDate(String releaseDate);
    }

    interface FilmPresenter{

        void getFilm();
    }
}