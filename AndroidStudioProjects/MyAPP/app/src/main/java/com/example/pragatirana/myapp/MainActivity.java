package com.example.pragatirana.myapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;
    String s1, s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if(s1.equals("") || s2.equals(""))
                    Toast.makeText(MainActivity.this, "Please fill in the data!", Toast.LENGTH_SHORT).show();
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("project", MODE_PRIVATE,null);
                    data.execSQL("create table if not exists user(name varchar, password varchar, email varchar, city varchar, phone varchar)");
                    String s4="select * from user where (name='"+s1+"' and password='"+s2+"')";
                    Cursor cursor=data.rawQuery(s4, null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(MainActivity.this, "Login done!", Toast.LENGTH_SHORT).show();
                        Intent b=new Intent(MainActivity.this, Third.class);
                        startActivity(b);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Invalid entries!", Toast.LENGTH_SHORT).show();
                        Intent c=new Intent(MainActivity.this, Second.class);
                        startActivity(c);
                        finish();
                    }
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, Second.class);
                startActivity(i);
                finish();
            }
        });
    }
}
