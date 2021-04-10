package com.richieoscar.musicapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.richieoscar.musicapp.R;
import com.richieoscar.musicapp.adapters.PlayListAdapter;
import com.richieoscar.musicapp.model.MusicLibrary;

public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
        ListView playList = findViewById(R.id.playListListview);
        PlayListAdapter adapter = new PlayListAdapter(this, MusicLibrary.PlayLists());
        playList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.getContext().startActivity(new Intent(PlayListActivity.this, DetailActivity.class));
            }
        });
        playList.setAdapter(adapter);
    }
}