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

public class Second extends AppCompatActivity {
    Button b1, b2;
    EditText t1, t2, t3, t4, t5, t6;
    String s1, s2, s3, s4, s5 ,s6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        t1=(EditText)findViewById(R.id.editText3);
        t2=(EditText)findViewById(R.id.editText4);
        t3=(EditText)findViewById(R.id.editText5);
        t4=(EditText)findViewById(R.id.editText6);
        t5=(EditText)findViewById(R.id.editText7);
        t6=(EditText)findViewById(R.id.editText8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Second.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=t1.getText().toString();
                s2=t2.getText().toString();
                s3=t3.getText().toString();
                s4=t4.getText().toString();
                s5=t5.getText().toString();
                s6=t6.getText().toString();
                if(s1.equals("") ||  s2.equals("") || s3.equals("") || s4.equals("")|| s5.equals("") || s6.equals(""))
                    Toast.makeText(Second.this, "Please fill in the details!", Toast.LENGTH_SHORT).show();
                else if(!s2.equals(s3))
                    Toast.makeText(Second.this, "Password did not match!", Toast.LENGTH_SHORT).show();
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("project", MODE_PRIVATE,null);
                    data.execSQL("create table if not exists user(name varchar, password varchar, email varchar, city varchar, phone varchar)");
                    String s="select * from user where name='"+s1+"'";
                    Cursor cursor=data.rawQuery(s, null);
                    if(cursor.getCount()>0)
                        Toast.makeText(Second.this, "Already registered!", Toast.LENGTH_SHORT).show();
                    else
                    {
                        data.execSQL("insert into user values('"+s1+"','"+s2+"', '"+s4+"', '"+s5+"', '"+s6+"')");
                        Toast.makeText(Second.this, "Signed up!", Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(Second.this, MainActivity.class);
                        startActivity(a);
                        finish();
                    }
                }
            }
        });
    }
}
