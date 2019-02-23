package com.example.hp.mymusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView telugu=(TextView)findViewById(R.id.Telugu);
        telugu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Telugu.class);
                startActivity(i);


            }
        }
        );

        TextView english=(TextView)findViewById(R.id.English);
        english.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent i=new Intent(MainActivity.this,English.class);
                                            startActivity(i);


                                        }
                                    }
        );

        TextView hindi=(TextView)findViewById(R.id.Hindi);
        hindi.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent i=new Intent(MainActivity.this,Hindi.class);
                                            startActivity(i);


                                        }
                                    }
        );


    }

}