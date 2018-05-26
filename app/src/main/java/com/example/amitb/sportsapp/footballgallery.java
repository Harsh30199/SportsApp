package com.example.amitb.sportsapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by HARSH on 22-04-2018.
 */
import android.os.Bundle;

import android.widget.ImageView;

public class footballgallery extends AppCompatActivity {
    private int[] imgsrc = {
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3,
            R.drawable.f4,
            R.drawable.f5,
            R.drawable.f6,
            R.drawable.f7,
            R.drawable.f8,
            R.drawable.f9,
            R.drawable.f10,
    };
    int i ;
    ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("FOOTBALL GALLERY");
        i = 0 ;
        click();
    }
    public void click()
    {
        i = 0 ;
        img = findViewById(R.id.imageView3);
        img.setImageResource(imgsrc[0]);
        img.setOnTouchListener(new OnSwipeTouchListener(this){

            public void onSwipeRight() {
                if(i==0)
                    i = 10 ;
                img.setImageResource((imgsrc[(i--)%10]));
            }
            public void onSwipeLeft() {

                img.setImageResource(imgsrc[(++i)%10]);

            }

        });
    }
}






