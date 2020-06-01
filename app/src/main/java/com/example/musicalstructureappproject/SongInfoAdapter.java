package com.example.musicalstructureappproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongInfoAdapter extends ArrayAdapter<com.example.musicalstructureappproject.SongInfo> {

    public SongInfoAdapter(Context context, ArrayList<com.example.musicalstructureappproject.SongInfo> pInfo) {
        super(context,0, pInfo);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_list_item, parent, false);
        }
        com.example.musicalstructureappproject.SongInfo song_info = getItem(position);
        TextView SongName = (TextView) listItemView.findViewById(R.id.songName_text_view);
        SongName.setText(song_info.getSongName());
        TextView SingerName = (TextView) listItemView.findViewById(R.id.singerName_text_view);
        SingerName.setText(song_info.getSingerName());

        // Find the ImageView in the songs_list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(song_info.getImageResourceId());

        return listItemView;
    }
}
