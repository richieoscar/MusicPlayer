package com.richieoscar.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.richieoscar.musicapp.model.MusicLibrary;
import com.richieoscar.musicapp.model.Song;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);
        ListView listView = findViewById(R.id.listView);
        Button playAll = findViewById(R.id.button_play_all);

        MusicAdapter adapter = new MusicAdapter(this, MusicLibrary.AllSongs());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Song song = MusicLibrary.AllSongs().get(position);
                Intent intent = new Intent(AllSongsActivity.this, DetailActivity.class);
                //intent.putExtra("Title", song.getTitle());
               // intent.putExtra("Artist", song.getArtist());
               // startActivity(intent);

            }
        });

        playAll.setOnClickListener(v->{
            Intent intent = new Intent(AllSongsActivity.this, DetailActivity.class);
            startActivity(intent);
        });

    }
}