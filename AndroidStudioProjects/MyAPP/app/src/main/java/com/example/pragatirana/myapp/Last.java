package com.example.pragatirana.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Last extends AppCompatActivity {
    Button b1, b2, b3, b4;
    WebView w;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        b1=(Button)findViewById(R.id.button31);
        b2=(Button)findViewById(R.id.button32);
        b3=(Button)findViewById(R.id.button33);
        b4=(Button)findViewById(R.id.button34);
        t=(TextView)findViewById(R.id.textView11);
        t.setText("Score:"+Integer.toString(Quiz.score));
        w=(WebView)findViewById(R.id.webView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w.loadUrl("https://www.facebook.com/");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w.loadUrl("https://twitter.com/");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w.loadUrl("http://www.netcamp.in/");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quiz.score=0;
                Intent i=new Intent(Last.this, Third.class);
                startActivity(i);
                finish();
            }
        });
    }
}
