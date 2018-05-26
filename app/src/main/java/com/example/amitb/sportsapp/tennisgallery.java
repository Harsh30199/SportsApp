package com.example.amitb.sportsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by HARSH on 22-04-2018.
 */

public class tennisgallery extends AppCompatActivity {
    private int[] imgsrc = {
            R.drawable.t1,
            R.drawable.t2,
            R.drawable.t3,
            R.drawable.t4,
            R.drawable.t5,
            R.drawable.t6,
            R.drawable.t7,
            R.drawable.t8,
            R.drawable.t9,
            R.drawable.t10,
    };
    int i ;
    ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("TENNIS GALLERY");
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




