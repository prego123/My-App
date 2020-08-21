package com.example.pragatirana.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cal extends AppCompatActivity {
    Button b1, b2, b3, b4, b7, b5, b6;
    EditText e1, e2;
    TextView t1;
    String s1, s2, res="";
    Float f1, f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        b1=(Button)findViewById(R.id.button12);
        b2=(Button)findViewById(R.id.button14);
        b3=(Button)findViewById(R.id.button15);
        b4=(Button)findViewById(R.id.button16);
        b5=(Button)findViewById(R.id.button17);
        b6=(Button)findViewById(R.id.button18);
        b7=(Button)findViewById(R.id.button19);
        e1=(EditText)findViewById(R.id.editText9);
        e2=(EditText)findViewById(R.id.editText10);
        t1=(TextView)findViewById(R.id.textView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Cal.this, Third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                res=Float.toString(f1+f2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                res=Float.toString(f1-f2);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                res=Float.toString(f1*f2);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                res=Float.toString(f1/f2);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(res);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                res="";
                t1.setText("");
            }
        });
    }
}
