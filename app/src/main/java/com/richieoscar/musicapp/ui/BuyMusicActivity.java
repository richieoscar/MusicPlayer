package com.richieoscar.musicapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.richieoscar.musicapp.R;
import com.richieoscar.musicapp.adapters.BuyMusicAdapter;
import com.richieoscar.musicapp.model.MusicLibrary;

public class BuyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_music);
        ListView listView = findViewById(R.id.buyMusicListView);
        Button connect = findViewById(R.id.button_buy_connect);
       BuyMusicAdapter adapter = new BuyMusicAdapter(this, MusicLibrary.BuyMusic());
        listView.setAdapter(adapter);
        connect.setOnClickListener(v->{
            startActivity(new Intent(this, ConnectActivity.class));
        });
    }
}