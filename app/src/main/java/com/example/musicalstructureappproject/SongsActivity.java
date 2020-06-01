package com.example.musicalstructureappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    public MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create a list of songs
        final ArrayList<com.example.musicalstructureappproject.SongInfo> info = new ArrayList<com.example.musicalstructureappproject.SongInfo>();
        info.add(new com.example.musicalstructureappproject.SongInfo("I Forgot You Existed","Taylor Swift",R.drawable.i_forgot_that_you_existed,R.raw.i_forgot_that_you_existed));
        info.add(new com.example.musicalstructureappproject.SongInfo("Cruel Summer","Taylor Swift",R.drawable.cruel_summer,R.raw.cruel_summer));
        info.add(new com.example.musicalstructureappproject.SongInfo("Lover","Taylor Swift",R.drawable.lover,R.raw.lover));
        info.add(new com.example.musicalstructureappproject.SongInfo(" The Man","Taylor Swift",R.drawable.the_man,R.raw.the_man));
        info.add(new com.example.musicalstructureappproject.SongInfo("The Archer","Taylor Swift",R.drawable.the_archer,R.raw.the_archer));
        info.add(new com.example.musicalstructureappproject.SongInfo("I Think He Knows","Taylor Swift",R.drawable.i_think_he_knows,R.raw.i_think_he_knows));
        info.add(new com.example.musicalstructureappproject.SongInfo("Miss Americana and the Heartbreak Prince","Taylor Swift",R.drawable.miss_americana,R.raw.miss_americana));
        info.add(new com.example.musicalstructureappproject.SongInfo("Paper Rings","Taylor Swift",R.drawable.paper_rings,R.raw.paper_rings));
        info.add(new com.example.musicalstructureappproject.SongInfo("Cornelia Street","Taylor Swift",R.drawable.cornelia_street,R.raw.cornelia_street));
        info.add(new com.example.musicalstructureappproject.SongInfo("Death By a Thousand Cuts","Taylor Swift",R.drawable.thousand_cuts,R.raw.thousand_cuts));
        info.add(new com.example.musicalstructureappproject.SongInfo("London Boy","Taylor Swift",R.drawable.lover,R.raw.london_boy));
        info.add(new com.example.musicalstructureappproject.SongInfo("Soon You'll Get Better ","Taylor Swift",R.drawable.lover,R.raw.soon_youll_get_better));
        info.add(new com.example.musicalstructureappproject.SongInfo("False God","Taylor Swift",R.drawable.lover,R.raw.false_god));
        info.add(new com.example.musicalstructureappproject.SongInfo("You Need to Calm Down","Taylor Swift",R.drawable.calm_down,R.raw.you_need_to_calmn_down));
        info.add(new com.example.musicalstructureappproject.SongInfo("Afterglow","Taylor Swift",R.drawable.lover,R.raw.afetglow));
        info.add(new com.example.musicalstructureappproject.SongInfo(" ME!","Taylor Swift",R.drawable.me,R.raw.me));
        info.add(new com.example.musicalstructureappproject.SongInfo(" It's Nice to Have a Friend","Taylor Swift",R.drawable.lover,R.raw.its_nice_to_have_a_friend));
        info.add(new com.example.musicalstructureappproject.SongInfo(" Daylight","Taylor Swift",R.drawable.lover,R.raw.daylight));

        // custom Adapter
        SongInfoAdapter adapter = new SongInfoAdapter(this, info);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                com.example.musicalstructureappproject.SongInfo song = info.get(position);
                mMediaPlayer = MediaPlayer.create(SongsActivity.this, song.getAudioResourceId());
                mMediaPlayer.start();
                Intent intent = new Intent(SongsActivity.this, NowPlaying.class);
                intent.putExtra("name",song.getSongName());
                intent.putExtra("image",song.getImageResourceId());
                startActivity(intent);


            }
        });

    }
}