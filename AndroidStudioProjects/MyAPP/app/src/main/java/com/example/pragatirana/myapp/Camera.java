package com.example.pragatirana.myapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Camera extends AppCompatActivity {
    Button b1, b2;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        b1=(Button)findViewById(R.id.button20);
        b2=(Button)findViewById(R.id.button21);
        im=(ImageView)findViewById(R.id.imageView8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Camera.this, Third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(j,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap b=(Bitmap)data.getExtras().get("data");
        im.setImageBitmap(b);
    }
}
