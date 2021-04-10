package com.richieoscar.musicapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.richieoscar.musicapp.R;
import com.richieoscar.musicapp.model.PlayList;
import com.richieoscar.musicapp.model.Song;

import java.util.List;

public class PlayListAdapter extends ArrayAdapter<PlayList>
{
    public PlayListAdapter(@NonNull Context context, @NonNull List<PlayList> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.play_list, parent, false);
        PlayList playList = getItem(position);
        TextView songTitle = view.findViewById(R.id.playList_title);
        songTitle.setText(playList.getTitle());
        return view;

    }
}
