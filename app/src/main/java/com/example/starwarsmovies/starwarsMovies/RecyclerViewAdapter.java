package com.example.starwarsmovies.starwarsMovies;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.starwarsmovies.R;
import com.example.starwarsmovies.models.Films;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

import static android.content.ContentValues.TAG;

//RecyclerView Adapter for displaying All films

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.FilmViewHolder> {

    private ArrayList<Films> films;
    private OnFilmItemClickListener onFilmItemClickListener;

    public RecyclerViewAdapter(ArrayList<Films> films, OnFilmItemClickListener onFilmItemClickListener)
    {
        this.films  = films;
        this.onFilmItemClickListener = onFilmItemClickListener;
    }

    @Override
    public FilmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.film_items,parent,false);
        return new FilmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FilmViewHolder holder, final int position) {
        holder.filmtitle.setText(films.get(position).getTitle());
        holder.filmDirector.setText("Directed by: " + films.get(position).getDirector());
        holder.filmrRelease.setText(films.get(position).getRelease_date());
        holder.filmRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: " + films.get(position).getTitle() + " Clicked");
                onFilmItemClickListener.onFilmClick(films.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        if (films==null)
        {
            return 0;
        }
        else
            return films.size();
    }

    public void setFilms(ArrayList<Films> films) {
        this.films = films;
    }

    public class FilmViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout filmRelative;
        TextView filmtitle, filmDirector, filmrRelease;

        public FilmViewHolder(View itemView) {
            super(itemView);
            filmRelative = (RelativeLayout) itemView.findViewById(R.id.relFilmList);
            filmtitle = (TextView) itemView.findViewById(R.id.txtFilmTitle);
            filmDirector = (TextView) itemView.findViewById(R.id.txtFilmDirector);
            filmrRelease = (TextView) itemView.findViewById(R.id.txtFilmRelease);
        }
    }

    public interface OnFilmItemClickListener
    {
        void onFilmClick(Films film);
    }
}