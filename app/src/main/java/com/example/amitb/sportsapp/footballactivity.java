package com.example.amitb.sportsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class footballactivity extends AppCompatActivity {
    private ArrayList<sportlayout> arrayList = new ArrayList<>();
    private LinearLayoutManager layoutManager ;
    private RecyclerView recyclerView;
    cricketactivity.propertyArrayAdapter adapter ;
    AnimationDrawable animationDrawable;
    ExpandableListView expandableListView;
    RelativeLayout relativeLayout;
    private TextView stats,reg, gallery;
    private TextView team ;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("FOOTBALL");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_footballactivity);
        arrayList.add(new sportlayout("ICT", "RJ COLLEGE", "1", "3", "WINNER: RJ COLLEGE", "LIONS CLUB"));
        arrayList.add(new sportlayout("VJTI", "SIES", "3", "4", "WINNER: SIES COLLEGE", "LIONS CLUB"));
        arrayList.add(new sportlayout("RIZVI COLLEGE", "SINHAGAD", "1", "2", "WINNER: SINHAGAD COLLEGE", "LIONS CLUB"));
        arrayList.add(new sportlayout("KHALSA", "RAIT", "1", "2", "WINNER: RAIT COLLEGE", "LIONS CLUB"));
        arrayList.add(new sportlayout("MPSTME B", "KJ COLLEGE", "1", "3", "WINNER: KJ COLLEGE", "LIONS CLUB"));

        relativeLayout = findViewById(R.id.rel);
        recyclerView =  findViewById(R.id.listview1);
        stats = findViewById(R.id.textView3);
        team = findViewById(R.id.textView4);
        gallery = findViewById(R.id.gallery);

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(footballactivity.this, footballgallery.class));
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(footballactivity.this, footballstats.class));
            }
        });
        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(footballactivity.this,team.class));
            }
        });
        initRecyclerView();
        reg = (TextView)findViewById(R.id.registration);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdtrO5hExzw6rB01mRbmwGTac6ew5N-0idK09HnsWJLAy7s8w/viewform?c=0&w=1");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
    private  void initRecyclerView()
    {
        layoutManager = new LinearLayoutManager(getBaseContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        SportsAdapter msgAdapter = new SportsAdapter(this.getLayoutInflater(), arrayList);
        recyclerView.setAdapter(msgAdapter);
        SnapHelper helper = new LinearSnapHelper();
        helper.attachToRecyclerView(recyclerView);
    }




    class propertyArrayAdapter extends ArrayAdapter<sportlayout> {

        private Context context;
        private List<sportlayout> arraylist;

        public propertyArrayAdapter(Context context, int resource, ArrayList<sportlayout> objects) {
            super(context, resource, objects);

            this.context = context;
            this.arraylist = objects;

        }

        public View getView(int position, View convertView, ViewGroup parent) {

            sportlayout property = arraylist.get(position);

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            View view;
            view = inflater.inflate(R.layout.sportlayout, null);


            TextView team1 = (TextView) view.findViewById(R.id.team1);
            TextView team2 = (TextView) view.findViewById(R.id.team2);
            TextView score1 = (TextView) view.findViewById(R.id.score1);
            TextView score2 = (TextView) view.findViewById(R.id.score2);
            TextView result = (TextView) view.findViewById(R.id.result);
            TextView venue = (TextView) view.findViewById(R.id.venue);


            team1.setText(property.getTeam1());
            team2.setText(property.getTeam2());
            score1.setText(property.getScore1());
            score2.setText(property.getScore2());
            result.setText(property.getResult());
            venue.setText(property.getVenue());
            return view;
        }
    }
}
