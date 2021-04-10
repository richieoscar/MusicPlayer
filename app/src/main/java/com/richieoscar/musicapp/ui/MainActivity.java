package com.richieoscar.musicapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.richieoscar.musicapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(R.string.music_library);
        TextView allSongs = findViewById(R.id.textView_all_songs);
        TextView buyMusic = findViewById(R.id.textView_buy_music);
        TextView connectTo = findViewById(R.id.textView_connect_to);
        TextView playList = findViewById(R.id.textView_playList);
        TextView nowPlaying = findViewById(R.id.textView_now_playing);
        ImageView imageAllSongs = findViewById(R.id.imageView_all_songs);
        ImageView imageNowPlaying = findViewById(R.id.imageView_now_playing);
        ImageView imagePlayList = findViewById(R.id.imageView_play_list);

        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);
        allSongs.setOnClickListener(v -> {
            startActivity(new Intent(this, AllSongsActivity.class));
        });
        imageAllSongs.setOnClickListener(v -> {
            startActivity(new Intent(this, AllSongsActivity.class));
        });
        buyMusic.setOnClickListener(v -> {
            startActivity(new Intent(this, BuyMusicActivity.class));
        });
        playList.setOnClickListener(v -> {
            startActivity(new Intent(this, PlayListActivity.class));
        });
        imagePlayList.setOnClickListener(v -> {
            startActivity(new Intent(this, PlayListActivity.class));
        });
        nowPlaying.setOnClickListener(v -> {
            startActivity(new Intent(this, DetailActivity.class));
        });
        imageNowPlaying.setOnClickListener(v -> {
            startActivity(new Intent(this, DetailActivity.class));
        });
        constraintLayout.setOnClickListener(v -> {
            startActivity(new Intent(this, DetailActivity.class));
        });
        connectTo.setOnClickListener(v -> {
            startActivity(new Intent(this, ConnectActivity.class));
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}