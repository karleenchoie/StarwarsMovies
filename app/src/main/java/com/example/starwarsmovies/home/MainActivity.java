package com.example.starwarsmovies.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.starwarsmovies.R;
import com.example.starwarsmovies.film.FilmActivity;
import com.example.starwarsmovies.film.FilmAdapter;
import com.example.starwarsmovies.home.HomeContract;
import com.example.starwarsmovies.home.HomePresenter;
import com.example.starwarsmovies.models.Films;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements HomeContract.HomeView{
    private static final String TAG = "MainActivity";

    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView recyclerView;
    FilmAdapter adapter;
    HomePresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        adapter = new FilmAdapter(null, new FilmAdapter.OnFilmItemClickListener() {
            @Override
            public void onFilmClick(Films film) {
                Log.i(TAG, "onFilmClick: " + film.getEpisode_id());
                presenter.onFilmItemClicked(film);
            }
        });
        recyclerView.setAdapter(adapter);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                presenter.getAllFilms();
            }
        });
        presenter = new HomePresenter(this);
        presenter.getAllFilms();
    }

    @Override
    public void showLoading() {
        swipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideLoading() {
        swipeRefreshLayout.setRefreshing(false);
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
        adapter.setFilms(films);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    @Override
    public void navigateToFilmPage(Films film) {
        Intent intent = new Intent(this, FilmActivity.class);
        intent.putExtra("EpisodeId",film.getEpisode_id());
        Log.i(TAG, "navigateToFilmPage: " + film.getEpisode_id());
        startActivity(intent);
    }


}

