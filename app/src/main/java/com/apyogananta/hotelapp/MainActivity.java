package com.apyogananta.hotelapp;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://images.trvl-media.com/lodging/2000000/1760000/1758400/1758357/186e58cb.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);

    }
}