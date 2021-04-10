package com.richieoscar.musicapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.richieoscar.musicapp.R;
import com.richieoscar.musicapp.adapters.MusicAdapter;
import com.richieoscar.musicapp.model.MusicLibrary;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);
        ListView listView = findViewById(R.id.listView);
        Button playAll = findViewById(R.id.button_play_all);
        TextView totalSongs = findViewById(R.id.textView_num_songs);
        int size = MusicLibrary.AllSongs().size();
        totalSongs.setText(String.valueOf(size) +getString(R.string.songs));
        MusicAdapter adapter = new MusicAdapter(this, MusicLibrary.AllSongs());
        listView.setAdapter(adapter);
        playAll.setOnClickListener(v->{
            Intent intent = new Intent(AllSongsActivity.this, DetailActivity.class);
            startActivity(intent);
        });

    }
}