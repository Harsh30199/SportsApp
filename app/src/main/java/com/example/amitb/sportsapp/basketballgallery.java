package com.example.amitb.sportsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by HARSH on 22-04-2018.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class basketballgallery extends AppCompatActivity {



        private int[] imgsrc = {
                R.drawable.b1,
                R.drawable.b2,
                R.drawable.b3,
                R.drawable.b4,
                R.drawable.b5,
                R.drawable.b6,
                R.drawable.b7,
                R.drawable.b8,
                R.drawable.b9,
                R.drawable.b10,
        };
        int i ;
        ImageView img ;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            getSupportActionBar().setTitle("BASKETBALL GALLERY");
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



