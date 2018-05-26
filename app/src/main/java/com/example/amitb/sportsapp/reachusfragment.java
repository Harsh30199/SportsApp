package com.example.amitb.sportsapp;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class reachusfragment extends Fragment {

     Uri maps; Dialog dialog;

    public reachusfragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_reachusfragment, container, false);

        final Button btn = (Button) rootView.findViewById(R.id.contact1);
        final Button btn1 =(Button) rootView.findViewById(R.id.social);
        final Button btn2 = rootView.findViewById(R.id.map);


        btn1.setTranslationX(-1000f);
        btn1.animate().translationXBy(1000f).setDuration(500);

        btn.setTranslationX(1000f);
        btn.animate().translationXBy(-1000f).setDuration(500);

        btn2.setTranslationX(-1000f);
        btn2.animate().translationXBy(1000f).setDuration(500);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);

                callIntent.setData(Uri.parse("tel:9137607693"));
                startActivity(callIntent);
            }
        }
        );

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.socialpopup);

                final ImageView f = (ImageView)dialog.findViewById(R.id.facebook);
                final ImageView i = (ImageView)dialog.findViewById(R.id.instagram);
                final ImageView s = (ImageView)dialog.findViewById(R.id.snapchat);

                f.animate().alpha(1f).setDuration(800);
                s.animate().alpha(1f).setDuration(800);
                i.animate().alpha(1f).setDuration(800);


                f.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri facebbok = Uri.parse("https://www.facebook.com/conquer018/");
                        startActivity(new Intent(Intent.ACTION_VIEW, facebbok));
                    }
                });

                i.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri instagram = Uri.parse("https://www.instagram.com/conquer_mumbai_2k16/");
                        startActivity(new Intent(Intent.ACTION_VIEW, instagram));
                    }
                });

                s.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri snapchat = Uri.parse("https://www.snapchat.com/add/conquer_18");
                        startActivity(new Intent(Intent.ACTION_VIEW, snapchat));
                    }
                });
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });




        //final Intent a = new Intent(getActivity(), social.class);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.venuespopup);
                final TextView cr = (TextView)dialog.findViewById(R.id.crpop);
                final TextView fb = (TextView)dialog.findViewById(R.id.fbpop);
                final TextView bb = (TextView)dialog.findViewById(R.id.bbpop);
                final TextView bad = (TextView)dialog.findViewById(R.id.badpop);
                final TextView lt = (TextView)dialog.findViewById(R.id.ltpop);
                final TextView tt = (TextView)dialog.findViewById(R.id.ttpop);
                final TextView close = dialog.findViewById(R.id.cross);

                cr.animate().alpha(1f).setDuration(500);
                fb.animate().alpha(1f).setDuration(500);
                bb.animate().alpha(1f).setDuration(500);
                bad.animate().alpha(1f).setDuration(500);
                lt.animate().alpha(1f).setDuration(500);
                tt.animate().alpha(1f).setDuration(500);


                cr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cric1();
                    }
                });
                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        football();
                    }
                });
                bb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bb();
                    }
                });
                bad.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bad();
                    }
                });
                lt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tennis();
                    }
                });
                tt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tt();
                    }
                });
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                dialog.show();
            }

        });

     return rootView;
    }
    public void tt()
    {

        maps = Uri.parse("geo:0,0?q=19.109883,72.837543(MPSTME)&z=19");
        displayMap();
    }


    public void bb()
    {
        maps = Uri.parse("geo:0,0?q=19.106943,72.841416(CNMS)&z=19");
        displayMap();
    }



    public void tennis()
    {
        maps = Uri.parse("geo:0,0?q=19.126107,72.827049(LEO ACADEMY)&z=19");
        displayMap();
    }


    public void football()
    {
        maps = Uri.parse("geo:0,0?q=19.090900,72.841344(LIONS CLUB)&z=19");
        displayMap();
    }
    public void cric1()
    {
        maps = Uri.parse("geo:0,0?q=19.025419,72.849739(MATUNGA GYMKHANA)&z=19");
        displayMap();
    }
    public  void bad()
    {
        maps = Uri.parse("geo:0,0?q=19.126797,72.83627(ANDHERI SPORTS COMPLEX)&z=19");
        displayMap();

    }
    public void displayMap()
    {
        Intent mapintent = new Intent(Intent.ACTION_VIEW, maps);
        mapintent.setPackage("com.google.android.apps.maps");
        startActivity(mapintent);
    }



}
