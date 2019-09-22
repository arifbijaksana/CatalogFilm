package com.arifbm.catalogfilm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.arifbm.catalogfilm.adapter.FilmAdapter;
import com.arifbm.catalogfilm.data.Film;
import com.arifbm.catalogfilm.data.FilmRepository;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "com.arifbm.catalogfilm";
    private List<Film> films ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        films = FilmRepository.getInstance().getFilmData();

        ListView listView = findViewById(R.id.list_view);
        FilmAdapter adapter = new FilmAdapter(this, films);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(ITEM_EXTRA, films.get(position));
                startActivity(intent);
            }
        });

     }
}
