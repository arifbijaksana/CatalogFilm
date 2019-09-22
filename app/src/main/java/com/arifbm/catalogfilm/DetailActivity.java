package com.arifbm.catalogfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.arifbm.catalogfilm.data.Film;

public class DetailActivity extends AppCompatActivity {

    private TextView textTitle, textYear, textDescription;
    private RatingBar ratingBar;
    private ImageView imgBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textTitle = findViewById(R.id.title);
        textYear = findViewById(R.id.year);
        textDescription = findViewById(R.id.description);
        ratingBar = findViewById(R.id.ratingBar);
        imgBanner = findViewById(R.id.banner);

        if (getIntent().getParcelableExtra(MainActivity.ITEM_EXTRA) != null) {
                    setItem((Film) getIntent().getParcelableExtra(MainActivity.ITEM_EXTRA));
        }
    }

        void setItem (Film film){
        textTitle.setText(film.getTitle());
        textYear.setText(String.valueOf(film.getYear()));
        textDescription.setText(film.getDescription());
        imgBanner.setImageResource(film.getBanner());
        ratingBar.setRating(film.getRating());

        }
}
