package com.richieoscar.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.richieoscar.musicapp.model.MusicLibrary;

public class BuyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_music);
        ListView listView = findViewById(R.id.buyMusicListView);
       BuyMusicAdapter adapter = new BuyMusicAdapter(this, MusicLibrary.BuyMusic());
        listView.setAdapter(adapter);
    }
}