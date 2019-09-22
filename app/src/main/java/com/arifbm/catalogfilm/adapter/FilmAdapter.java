package com.arifbm.catalogfilm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.arifbm.catalogfilm.R;
import com.arifbm.catalogfilm.data.Film;

import java.util.List;

public class FilmAdapter extends BaseAdapter {

    private final Context context;
    private List<Film> films;

    public FilmAdapter(Context context, List<Film> films) {

        this.context = context;
        this.films = films;

    }

    @Override
    public int getCount() {
        return films.size();
    }

    @Override
    public Film getItem(int position) {
        return films.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_film, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Film film = getItem(position);
        viewHolder.bind(film);
        return view;
    }

    private class ViewHolder {
        private TextView txtTitle;
        private TextView txtYear;
        private ImageView imgBanner;
        private RatingBar rating;

        ViewHolder(View view) {
            txtTitle = view.findViewById(R.id.title);
            txtYear = view.findViewById(R.id.year);
            imgBanner = view.findViewById(R.id.banner);
            rating = view.findViewById(R.id.ratingBar);
        }

        void bind(Film film) {
            txtTitle.setText(film.getTitle());
            txtYear.setText(String.valueOf(film.getYear()));
            imgBanner.setImageResource(film.getBanner());
            rating.setRating(film.getRating());

        }
    }
}
