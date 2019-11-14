package com.example.starwarsmovies.starwarsMovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.starwarsmovies.R;
import com.example.starwarsmovies.filmDetails.FilmsActivity;
import com.example.starwarsmovies.models.Films;

import java.util.ArrayList;



//    ACTIVITY FOR DISPLAYING ALL STAR WARS MOVIES

public class MainActivity extends AppCompatActivity implements MainContract.HomeView{
    private static final String TAG = "MainActivity";

    SwipeRefreshLayout mSwipeRefreshLayout;
    RecyclerView mRecyclerView;
    RecyclerViewAdapter mRecyclerViewAdapter;
    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);

        mRecyclerViewAdapter = new RecyclerViewAdapter(null, new RecyclerViewAdapter.OnFilmItemClickListener() {
            @Override
            public void onFilmClick(Films film) {
                Log.i(TAG, "onFilmClick: " + film.getEpisode_id());
                mMainPresenter.onFilmItemClicked(film);
            }
        });

        mRecyclerView.setAdapter(mRecyclerViewAdapter);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mMainPresenter.getAllFilms();
            }
        });
        mMainPresenter = new MainPresenter(this);
        mMainPresenter.getAllFilms();
    }

    @Override
    public void showLoading() {
        mSwipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideLoading() {
        mSwipeRefreshLayout.setRefreshing(false);
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
    public void showAllFilms(ArrayList<Films> films) {
        Log.i(TAG, "showAllFilms: " + films.size());
        mRecyclerViewAdapter.setFilms(films);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
        mRecyclerViewAdapter.notifyDataSetChanged();
    }

    @Override
    public void navigateToFilmPage(Films film) {
        Intent intent = new Intent(this, FilmsActivity.class);
        intent.putExtra("EpisodeId",film.getEpisode_id());
        Log.i(TAG, "navigateToFilmPage: " + film.getEpisode_id());
        startActivity(intent);
    }
}

