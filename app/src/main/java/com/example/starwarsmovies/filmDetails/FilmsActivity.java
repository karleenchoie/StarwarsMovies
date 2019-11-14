package com.example.starwarsmovies.filmDetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.starwarsmovies.R;
import com.example.starwarsmovies.characters.CharacterListAdapter;

import java.util.ArrayList;

//Activity for displaying star wars movie details

public class FilmsActivity extends AppCompatActivity implements FilmsContract.FilmView {

    ProgressBar mProgressBar;
    TextView mReleaseDate, mDirector;
    RecyclerView mCharacterRecylerView;
    FilmsContract.FilmPresenter mFilmPresenter;
    ArrayList<String>characters;
    RecyclerView.LayoutManager mLayoutManager;
    CharacterListAdapter characterListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        mReleaseDate = (TextView) findViewById(R.id.txtRelease);
        mDirector = (TextView) findViewById(R.id.txtDirector);
        mCharacterRecylerView = (RecyclerView) findViewById(R.id.recycler_view_characters);
        mLayoutManager = new LinearLayoutManager(this);
        mCharacterRecylerView.setLayoutManager(mLayoutManager);
        characterListAdapter = new CharacterListAdapter(this,characters);
        mCharacterRecylerView.setAdapter(characterListAdapter);


        mFilmPresenter = new FilmsPresenter(getIntent().getIntExtra("EpisodeId", 0), this);
        mFilmPresenter.getFilm();
    }

    @Override
    public void showLoading() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDirector(String director) {
        this.mDirector.setText(director);
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
