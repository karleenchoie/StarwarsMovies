package com.example.starwarsmovies.film;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.starwarsmovies.R;

public class FilmActivity extends AppCompatActivity implements FilmContract.FilmView{

    ProgressBar progressBar;
    TextView mReleaseDate;
    FilmContract.FilmPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        mReleaseDate = (TextView) findViewById(R.id.txtReleaseDate);
        presenter = new FilmPresenter(getIntent().getIntExtra("EpisodeId",0),this);
        presenter.getFilm();
    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showTitle(String title) {
        setTitle(title);
    }

    @Override
    public void showReleaseDate(String releaseDate) {
        this.mReleaseDate.setText(releaseDate);
    }
}
