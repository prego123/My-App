package com.example.pragatirana.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Fourthq extends AppCompatActivity {
    Button b1;
    RadioButton r1, r2, r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthq);
        r1=(RadioButton)findViewById(R.id.radioButton10);
        r2=(RadioButton)findViewById(R.id.radioButton11);
        r3=(RadioButton)findViewById(R.id.radioButton12);
        b1=(Button)findViewById(R.id.button29);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked())
                    ++Quiz.score;
                else
                    --Quiz.score;
                Intent i=new Intent(Fourthq.this, Fifthq.class);
                startActivity(i);
                finish();
            }
        });
    }
}
