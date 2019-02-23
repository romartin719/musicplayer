package com.example.hp.mymusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Telugu extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telugu);
        final ArrayList<word> songs=new ArrayList<word>();
        songs.add(new word("JayLavaKusha","Swing Zara",R.drawable.jailavakusha,R.raw.sample));
        songs.add(new word("Savyasachi","Savyasachi",R.drawable.savyasachi,R.raw.sample));
        songs.add(new word("Agnathavasi","Dhaga dhaga",R.drawable.agnathavasi,R.raw.sample));
        songAdapter adapter= new songAdapter(this,songs);

        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word words=songs.get(position);
               mediaPlayer=MediaPlayer.create(Telugu.this,words.getSongSourceIdName());
               mediaPlayer.start();
            }
        });
    }
}
