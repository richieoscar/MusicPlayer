package com.richieoscar.musicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView allSongs = findViewById(R.id.textView_all_songs);
        TextView buyMusic = findViewById(R.id.textView_buy_music);
        TextView connectTo = findViewById(R.id.textView_connect_to);
        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);
        allSongs.setOnClickListener(v -> {
            startActivity(new Intent(this, AllSongsActivity.class));
        });

        buyMusic.setOnClickListener(v->{
            startActivity(new Intent(this, BuyMusicActivity.class));
        });

        constraintLayout.setOnClickListener(v->{
            startActivity(new Intent(this, DetailActivity.class));
        });
        connectTo.setOnClickListener(v->{
            startActivity(new Intent(this, ConnectActivity.class));
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}