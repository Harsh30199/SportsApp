package com.example.amitb.sportsapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.firebase.client.authentication.Constants;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class sponsorsfragment extends Fragment {

    private Firebase storage;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter ;
    DatabaseReference databaseReference;
    Uri uri;

    public sponsorsfragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sponsorsfragment, container, false);
        final ImageView anytime, atkt, dukes, foxtees, fusionfest, healthie,hrs, mojocco, nanavati, newsaurchai, orthosports, radiocity, skinslayer, sportsnasha, sportswise, textguru, truerevo, vinayhankare, yogi, youth, zest, zinq;

        anytime = (ImageView)rootView. findViewById(R.id.anytime);
        atkt = (ImageView)rootView. findViewById(R.id.atkt);
        dukes = (ImageView)rootView.findViewById(R.id.dukes);
        foxtees = (ImageView)rootView.findViewById(R.id.foxtees);
        fusionfest = (ImageView)rootView.findViewById(R.id.fusionfest);
        healthie = (ImageView)rootView.findViewById(R.id.healthie);
        hrs = (ImageView)rootView.findViewById(R.id.hrs);
        mojocco = (ImageView)rootView.findViewById(R.id.mojocco);
        nanavati = (ImageView)rootView.findViewById(R.id.nanavati);
        newsaurchai = (ImageView)rootView.findViewById(R.id.newsaurchai);
        orthosports = (ImageView)rootView.findViewById(R.id.orthosports);
        radiocity = (ImageView)rootView.findViewById(R.id.radiocity);
        skinslayer = (ImageView)rootView.findViewById(R.id.skinslayer);
        sportsnasha = (ImageView)rootView.findViewById(R.id.sportsnasha);
        sportswise = (ImageView)rootView.findViewById(R.id.sportswise);
        truerevo = (ImageView)rootView.findViewById(R.id.truerevo);
        textguru = (ImageView)rootView.findViewById(R.id.textguru);
        vinayhankare = (ImageView)rootView.findViewById(R.id.vinayhankare);
        yogi = (ImageView)rootView.findViewById(R.id.yogisports);
        youth = (ImageView)rootView.findViewById(R.id.youth);
        zest = (ImageView)rootView.findViewById(R.id.zest);
        zinq = (ImageView)rootView.findViewById(R.id.zinq);

        radiocity.setTranslationX(-1000f);
        radiocity.animate().translationXBy(1000f).setDuration(500);

        foxtees.setTranslationX(-1000f);
        foxtees.animate().translationXBy(1000f).setDuration(500);

        anytime.setTranslationX(-1000f);
        anytime.animate().translationXBy(1000f).setDuration(500);

        zest.setTranslationX(-1000f);
        zest.animate().translationXBy(1000f).setDuration(500);

        yogi.setTranslationX(-1000f);
        yogi.animate().translationXBy(1000f).setDuration(500);

        truerevo.setTranslationX(-1000f);
        truerevo.animate().translationXBy(1000f).setDuration(500);

        sportsnasha.setTranslationX(-1000f);
        sportsnasha.animate().translationXBy(1000f).setDuration(500);

        sportswise.setTranslationX(-1000f);
        sportswise.animate().translationXBy(1000f).setDuration(500);

        skinslayer.setTranslationX(-1000f);
        skinslayer.animate().translationXBy(1000f).setDuration(500);

        hrs.setTranslationX(-1000f);
        hrs.animate().translationXBy(1000f).setDuration(500);

        nanavati.setTranslationX(-1000f);
        nanavati.animate().translationXBy(1000f).setDuration(500);

        dukes.setTranslationX(1000f);
        dukes.animate().translationXBy(-1000f).setDuration(500);

        atkt.setTranslationX(1000f);
        atkt.animate().translationXBy(-1000f).setDuration(500);

        zinq.setTranslationX(1000f);
        zinq.animate().translationXBy(-1000f).setDuration(500);

        youth.setTranslationX(1000f);
        youth.animate().translationXBy(-1000f).setDuration(500);

        vinayhankare.setTranslationX(1000f);
        vinayhankare.animate().translationXBy(-1000f).setDuration(500);

        textguru.setTranslationX(1000f);
        textguru.animate().translationXBy(-1000f).setDuration(500);

        healthie.setTranslationX(1000f);
        healthie.animate().translationXBy(-1000f).setDuration(500);

        mojocco.setTranslationX(1000f);
        mojocco.animate().translationXBy(-1000f).setDuration(500);

        fusionfest.setTranslationX(1000f);
        fusionfest.animate().translationXBy(-1000f).setDuration(500);

        orthosports.setTranslationX(1000f);
        orthosports.animate().translationXBy(-1000f).setDuration(500);



        String anytimeurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/anytime%20finess.jpg?alt=media&token=45bdbe02-8791-46e4-a46b-d72a5c9a80d5";
        Glide.with(getContext()).load(anytimeurl).into(anytime);

        String atkturl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/atkt.jpg?alt=media&token=b7f16db4-daae-4546-adc9-39032f2057b0";
        Glide.with(getContext()).load(atkturl).into(atkt);

        String dukesurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/dukes.png?alt=media&token=2d719fd5-5b85-4e16-a041-a1bc754cbbf5";
        Glide.with(getContext()).load(dukesurl).into(dukes);

        String foxteesurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/foxtees.jpg?alt=media&token=31ff5920-bdee-46e2-9ef9-b326b872c199";
        Glide.with(getContext()).load(foxteesurl).into(foxtees);

        String fusionfesturl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/fusionfest.jpg?alt=media&token=06f3721b-59d0-482c-80cb-98f8bca98bf7";
        Glide.with(getContext()).load(fusionfesturl).into(fusionfest);

        String healthieurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/healthie.jpg?alt=media&token=c6b3aa0e-1c41-4239-8266-b68c965fed59";
        Glide.with(getContext()).load(healthieurl).into(healthie);

        String hrsurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/hrs.jpg?alt=media&token=4edd1fa8-e21f-4145-8525-1c99efdf3b58";
        Glide.with(getContext()).load(hrsurl).into(hrs);

        String mojoccourl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/mojoco.jpg?alt=media&token=f500b21d-2164-490c-be58-8cbaf0eb5ac1";
        Glide.with(getContext()).load(mojoccourl).into(mojocco);

        String nanavatiurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/nanavati.jpg?alt=media&token=4ae18a13-0fda-4ccb-b692-bab5ee0744ce";
        Glide.with(getContext()).load(nanavatiurl).into(nanavati);

        String newsaurchaiurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/newsaurchai.jpg?alt=media&token=0a36352d-4529-4f90-9643-cdf22707dffc";
        Glide.with(getContext()).load(newsaurchaiurl).into(newsaurchai);

        String orthosportsurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/orthosports.jpg?alt=media&token=be3b8db2-cbc3-4663-97a7-cef58299ddac";
        Glide.with(getContext()).load(orthosportsurl).into(orthosports);

        String radiocityurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/radiocity.jpg?alt=media&token=57dc9736-fda5-40ca-91d9-3b03d0c9e324";
        Glide.with(getContext()).load(radiocityurl).into(radiocity);

        String skinslayerurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/skinslayer.jpg?alt=media&token=9afca0ac-27ec-4fe1-a65e-c350a3fa771c";
        Glide.with(getContext()).load(skinslayerurl).into(skinslayer);

        String sportsnashaurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/sportsnasha.jpg?alt=media&token=c53a64ba-92a8-4110-a8c3-450510fee875";
        Glide.with(getContext()).load(sportsnashaurl).into(sportsnasha);

        String sportswiseurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/sportswise.jpg?alt=media&token=44f1353d-1bc8-4d29-aa5a-8d17825be386";
        Glide.with(getContext()).load(sportswiseurl).into(sportswise);

        String truerevourl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/truerevo.jpg?alt=media&token=60ed0a4f-c004-4751-aafc-e2be04083ca1";
        Glide.with(getContext()).load(truerevourl).into(truerevo);

        String textguruurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/textguru.jpg?alt=media&token=2ace1791-56b5-4b56-b903-5e301e0ef795";
        Glide.with(getContext()).load(textguruurl).into(textguru);

        String vinayhankareurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/vinayhankare.jpg?alt=media&token=90129c9f-3703-461e-831a-96f87f3ead08";
        Glide.with(getContext()).load(vinayhankareurl).into(vinayhankare);

        String yogiurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/yogisports.jpg?alt=media&token=736edf77-10c7-44a0-926f-254db2215344";
        Glide.with(getContext()).load(yogiurl).into(yogi);

        String youthurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/youth.jpg?alt=media&token=861fd585-0195-4f5e-9e8d-35fd7c096184";
        Glide.with(getContext()).load(youthurl).into(youth);

        String zesturl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/zestchocolates.jpg?alt=media&token=01d2d491-e1c0-4569-8d91-51349e72564d";
        Glide.with(getContext()).load(zesturl).into(zest);

        String zinqurl = "https://firebasestorage.googleapis.com/v0/b/conquer-247eb.appspot.com/o/zinqcard.jpg?alt=media&token=4c501713-36e5-4613-a8e5-2c579e91001f";
        Glide.with(getContext()).load(zinqurl).into(zinq);

        radiocity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radiocity();
            }
        });

        dukes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dukes();
            }
        });

        foxtees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foxtees();
            }
        });

        atkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                atkt();
            }
        });

        anytime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anytime();
            }
        });

        zinq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zinq();
            }
        });

        zest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zest();
            }
        });

        youth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youth();
            }
        });

        yogi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yogi();
            }
        });

        vinayhankare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vinayhankare();
            }
        });

        truerevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                truerevo();
            }
        });

        textguru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textguru();
            }
        });

        sportswise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sportswise();
            }
        });

        sportsnasha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sportsnasha();
            }
        });

        skinslayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skinslayer();
            }
        });

        healthie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthie();
            }
        });

        newsaurchai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newsaurchai();
            }
        });

        orthosports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orthosports();
            }
        });

        nanavati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nanavati();
            }
        });

        fusionfest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fusionfest();
            }
        });

        hrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hrs();
            }
        });

        mojocco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mojocco();
            }
        });

        return rootView;
        }

    private void mojocco() {

        uri = Uri.parse("http://habhit.co.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void hrs() {

        uri = Uri.parse("http://www.hrs.co.in/index.php/en/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void fusionfest() {

        uri = Uri.parse("http://fusionfestcafe.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void nanavati() {

        uri = Uri.parse("http://www.nanavatihospital.org/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void orthosports() {

        uri = Uri.parse("http://www.orthosports.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void newsaurchai() {

        uri = Uri.parse("https://newsaurchai.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void healthie() {

        uri = Uri.parse("https://www.healthie.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void skinslayer() {

        uri = Uri.parse("https://www.skinslayer.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void sportsnasha() {

        uri = Uri.parse("https://www.sportsnasha.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void sportswise() {

        uri = Uri.parse("http://www.sportwiseindia.com/education/the-top-ten-fitness-trends-for-2018/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void textguru() {

        uri = Uri.parse("https://www.textguru.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void truerevo() {

        uri = Uri.parse("https://www.truerevo.com/#welcome");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void vinayhankare() {

        uri = Uri.parse("https://www.facebook.com/vinayhankaremediaworks/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void yogi() {

        uri = Uri.parse("https://www.yogisportinggoods.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void youth() {

        uri = Uri.parse("http://www.youthincmag.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void zest() {

        uri = Uri.parse("https://zestchocolates.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void zinq() {

        uri = Uri.parse("http://www.zinqcard.com/web/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void anytime() {

        uri = Uri.parse("https://www.anytimefitness.co.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void atkt() {

        uri = Uri.parse("https://atkt.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void foxtees() {

        uri = Uri.parse("http://foxtees-sports.business.site/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void dukes() {

        uri = Uri.parse("http://www.dukesindia.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void radiocity() {

        uri = Uri.parse("http://www.radiocity.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }




}


