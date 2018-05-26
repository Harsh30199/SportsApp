package com.example.amitb.sportsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by amitb on 4/23/2018.
 */

public class badmintongallery extends AppCompatActivity {
    private int[] imgsrc = {
            R.drawable.bad1,
            R.drawable.bad2,
            R.drawable.bad3,
            R.drawable.bad4,
            R.drawable.bad5,
            R.drawable.bad6,
            R.drawable.bad7,
            R.drawable.bad8,
            R.drawable.bad9,
            R.drawable.bad10,
    };
    int i ;
    ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("BADMINTON GALLERY");
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





