package com.example.pragatirana.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Fifthq extends AppCompatActivity {
    RadioButton r1, r2, r3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthq);
        r1=(RadioButton)findViewById(R.id.radioButton13);
        r2=(RadioButton)findViewById(R.id.radioButton14);

        r3=(RadioButton)findViewById(R.id.radioButton15);
        b1=(Button)findViewById(R.id.button30);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked())
                    ++Quiz.score;
                else
                    --Quiz.score;
                Intent i=new Intent(Fifthq.this, Last.class);
                startActivity(i);
                finish();
            }
        });

    }
}
