package com.example.pragatirana.myapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Magical extends AppCompatActivity implements SensorEventListener {
    TextView t1;
    Button b;
    MediaPlayer mp;
    SensorManager sm;
    Sensor s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magical);
        t1=(TextView)findViewById(R.id.textView5);
        t1.setTypeface(null, Typeface.BOLD);
        b=(Button)findViewById(R.id.button25);
        mp=MediaPlayer.create(this, R.raw.s1);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this, s, SensorManager.SENSOR_DELAY_NORMAL);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
                Intent i=new Intent(Magical.this, Special.class);
                startActivity(i);
                finish();
            }
        });

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.values[0]>1)
            mp.start();
        else
            mp.pause();
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
