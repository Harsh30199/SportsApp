package com.example.amitb.sportsapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;



public class cricketgallery extends AppCompatActivity {
    private int[] imgsrc = {
            R.drawable.c1,
            R.drawable.c2,
            R.drawable.c3,
            R.drawable.c4,
            R.drawable.c5,
            R.drawable.c6,
            R.drawable.c7,
            R.drawable.c8,
            R.drawable.c9,
            R.drawable.c10,
    };
    int i ;
    ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("CRICKET GALLERY");
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


