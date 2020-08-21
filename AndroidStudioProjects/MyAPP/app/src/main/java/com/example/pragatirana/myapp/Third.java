package com.example.pragatirana.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Third extends AppCompatActivity {
    Button b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1=(Button)findViewById(R.id.button6);
        b2=(Button)findViewById(R.id.button5);
        b3=(Button)findViewById(R.id.button7);
        b4=(Button)findViewById(R.id.button8);
        b5=(Button)findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Third.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Third.this, Mediaplayer.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Third.this, Cal.class);
                startActivity(k);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Third.this, Camera.class);
                startActivity(l);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(Third.this, Special.class);
                startActivity(m);
                finish();
            }
        });
    }
}
