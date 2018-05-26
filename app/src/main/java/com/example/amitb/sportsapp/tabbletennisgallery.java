package com.example.amitb.sportsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class tabbletennisgallery extends AppCompatActivity {
    private int[] imgsrc = {
            R.drawable.tt1,
            R.drawable.tt2,
            R.drawable.tt3,
            R.drawable.tt4,
            R.drawable.tt5,
            R.drawable.tt6,
            R.drawable.tt7,
            R.drawable.tt8,
            R.drawable.tt9,
            R.drawable.tt10,
    };
    int i ;
    ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("TABLE TENNIS GALLERY");
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
