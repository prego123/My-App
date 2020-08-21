package com.example.pragatirana.myapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mediaplayer extends AppCompatActivity {
    Button b1, b2, b3;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediaplayer);
        b1=(Button)findViewById(R.id.button11);
        b2=(Button)findViewById(R.id.button10);
        b3=(Button)findViewById(R.id.button13);
        mp=MediaPlayer.create(this, R.raw.s);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
                Intent i=new Intent(Mediaplayer.this, Third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });
    }
}
