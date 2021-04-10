package com.richieoscar.musicapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.richieoscar.musicapp.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView songTitle = findViewById(R.id.textView_det_title);
        TextView artistName = findViewById(R.id.textView_det_artist);
        ImageView playList = findViewById(R.id.imageView_det_to_playlist);
        playList.setOnClickListener(v->{
            startActivity(new Intent(this, PlayListActivity.class));
        });

    }
}