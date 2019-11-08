package com.example.starwarsmovies.film;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.starwarsmovies.R;
import com.example.starwarsmovies.models.Films;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

import static android.content.ContentValues.TAG;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.FilmViewHolder> {

    private ArrayList<Films> films;
    private OnFilmItemClickListener onFilmItemClickListener;

    public FilmAdapter(ArrayList<Films> films, OnFilmItemClickListener onFilmItemClickListener)
    {
        this.films  = films;
        this.onFilmItemClickListener = onFilmItemClickListener;
    }

    @Override
    public FilmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_film_item,parent,false);
        return new FilmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FilmViewHolder holder, final int position) {
        holder.title.setText(films.get(position).getTitle() + films.get(position).getEpisode_id());
        holder.title.setOnClickListener(new View.OnClickListener() {
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

    class FilmViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        FilmViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }

    public interface OnFilmItemClickListener
    {
        void onFilmClick(Films film);
    }
}