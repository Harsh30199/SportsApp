package com.example.amitb.sportsapp;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {



            switch (item.getItemId()) {

                case R.id.navigation_home:
                    homefragment homefragment1 = new homefragment();
                    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.frame,homefragment1);
                    ft.commit();
                    return true;

                case R.id.navigation_aboutus:
                    AboutFragment aboutfragment1 = new AboutFragment();
                    android.support.v4.app.FragmentTransaction at = getSupportFragmentManager().beginTransaction();
                    at.replace(R.id.frame,aboutfragment1);
                    at.commit();
                    return true;

                case R.id.navigation_reachus:
                    reachusfragment reachusfragment = new reachusfragment();
                    android.support.v4.app.FragmentTransaction ct = getSupportFragmentManager().beginTransaction();
                    ct.replace(R.id.frame,reachusfragment);
                    ct.commit();
                    return true;

                case R.id.navigation_sponsor:
                    sponsorsfragment sponsorsfragment = new sponsorsfragment();
                    android.support.v4.app.FragmentTransaction dt = getSupportFragmentManager().beginTransaction();
                    dt.replace(R.id.frame,sponsorsfragment);
                    dt.commit();
                    return true;

            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
       getSupportActionBar().setTitle("CONQUER");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_home);


    }

}
