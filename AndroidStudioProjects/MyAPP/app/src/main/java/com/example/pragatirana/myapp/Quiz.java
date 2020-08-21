package com.example.pragatirana.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {
    RadioButton r1, r2, r3;
    Button b1;
    static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        b1=(Button)findViewById(R.id.button27);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                if(r2.isChecked())
                    ++score;
                else
                    --score;
                Intent i=new Intent(Quiz.this, Secondq.class);
                startActivity(i);
                finish();
            }
        });
    }
}
