package com.richieoscar.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

       String title = getIntent().getStringExtra("Title");
       String artist = getIntent().getStringExtra("Artist");
        TextView songTitle = findViewById(R.id.textView_det_title);
        TextView artistName = findViewById(R.id.textView_det_artist);
        //songTitle.setText(title);
        //artistName.setText(artist);

    }
}