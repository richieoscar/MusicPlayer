package com.richieoscar.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.richieoscar.musicapp.model.Song;

import java.util.List;

public class MusicAdapter extends ArrayAdapter<Song>
{
    public MusicAdapter(@NonNull Context context, @NonNull List<Song> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.music_list, parent, false);
        Song song = getItem(position);
        TextView songTitle = view.findViewById(R.id.song_title);
        TextView artistName = view.findViewById(R.id.artist_name);
        songTitle.setText(song.getTitle());
        artistName.setText(song.getArtist());
        return view;

    }
}
