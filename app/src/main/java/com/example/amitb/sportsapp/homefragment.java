package com.example.amitb.sportsapp;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;




public class homefragment extends Fragment{

    Intent crintent, fbintent, bbintent, badintent, ltintent, ttintent;
    AnimationDrawable animationDrawable;
    RelativeLayout relativeLayout;
    public homefragment() {}

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_homefragment, container, false);
        relativeLayout = (RelativeLayout)rootView.findViewById(R.id.rel);
        animationDrawable = (AnimationDrawable)relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();
        final ImageView cr = (ImageView)rootView.findViewById(R.id.cr);
        final ImageView fb = (ImageView)rootView.findViewById(R.id.fb);
        final ImageView bb = (ImageView)rootView.findViewById(R.id.bb);
        final ImageView bad = (ImageView)rootView.findViewById(R.id.bad);
        final ImageView lt = (ImageView)rootView.findViewById(R.id.lt);
        final ImageView tt = (ImageView)rootView.findViewById(R.id.tt);

        final TextView crt = (TextView)rootView.findViewById(R.id.crt);
        final TextView fbt = (TextView)rootView.findViewById(R.id.fbt);
        final TextView bbt = (TextView)rootView.findViewById(R.id.bbt);
        final TextView badt = (TextView)rootView.findViewById(R.id.badt);
        final TextView ltt = (TextView)rootView.findViewById(R.id.ltt);
        final TextView ttt = (TextView)rootView.findViewById(R.id.ttt);

        cr.setTranslationX(-1000f);
        cr.animate().translationXBy(1000f).setDuration(500);

        bb.setTranslationX(-1000f);
        bb.animate().translationXBy(1000f).setDuration(500);

        lt.setTranslationX(-1000f);
        lt.animate().translationXBy(1000f).setDuration(500);

        fb.setTranslationX(1000f);
        fb.animate().translationXBy(-1000f).setDuration(500);

        bad.setTranslationX(1000f);
        bad.animate().translationXBy(-1000f).setDuration(500);

        tt.setTranslationX(1000f);
        tt.animate().translationXBy(-1000f).setDuration(500);

        crt.setTranslationX(-1000f);
        crt.animate().translationXBy(1000f).setDuration(500);

        bbt.setTranslationX(-1000f);
        bbt.animate().translationXBy(1000f).setDuration(500);

        ltt.setTranslationX(-1000f);
        ltt.animate().translationXBy(1000f).setDuration(500);

        fbt.setTranslationX(1000f);
        fbt.animate().translationXBy(-1000f).setDuration(500);

        badt.setTranslationX(1000f);
        badt.animate().translationXBy(-1000f).setDuration(500);

        ttt.setTranslationX(1000f);
        ttt.animate().translationXBy(-1000f).setDuration(500);



        crintent = new Intent(getActivity(), cricketactivity.class);
        cr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(crintent);
        }
    });
        crt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(crintent);
        }
    });

        fbintent = new Intent(getActivity(), footballactivity.class);
        fb.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(fbintent);
        }
    });
        fbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(fbintent);
            }
        });

        bbintent = new Intent(getActivity(), basketballactivity.class);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(bbintent);
            }
        });
        bbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(bbintent);
            }
        });

        badintent = new Intent(getActivity(), badmintonactivity.class);
        bad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(badintent);
            }
        });
        badt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(badintent);
            }
        });

        ltintent = new Intent(getActivity(), tennisactivity.class);
        lt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(ltintent);
            }
        });
        ltt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(ltintent);
            }
        });

        ttintent = new Intent(getActivity(), tabletennisactivity.class);
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(ttintent);
            }
        });
        ttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(ttintent);
            }
        });

        return rootView;
    }

}


