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

public class tabletennisactivity extends AppCompatActivity {

    private ArrayList<sportlayout> arrayList = new ArrayList<>();
    private LinearLayoutManager layoutManager ;
    private RecyclerView recyclerView;
    cricketactivity.propertyArrayAdapter adapter ;
    AnimationDrawable animationDrawable;
    ExpandableListView expandableListView;
    RelativeLayout relativeLayout;
    private TextView stats, gallery;
    private TextView team,reg ;
    Uri uri;

    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("TABLE TENNIS");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabletennisactivity);
        arrayList.add(new sportlayout("MPSTME A", "RJ COLLEGE", "3", "2", "WINNER: MPSTME COLLEGE", "MPSTME          ||FINALS||"));
        arrayList.add(new sportlayout("VJTI", "SIES", "1", "4", "WINNER: SIES COLLEGE", "MPSTME"));
        arrayList.add(new sportlayout("RIZVI COLLEGE", "SINHAGAD", "0", "5", "WINNER: SINHAGAD COLLEGE", "MPSTME"));
        arrayList.add(new sportlayout("KHALSA", "RAIT", "2", "3", "WINNER: RAIT COLLEGE", "MPSTME"));
        arrayList.add(new sportlayout("MPSTME B", "KJ COLLEGE", "2", "3", "WINNER: KJ COLLEGE", "MPSTME"));

        relativeLayout = findViewById(R.id.rel);
        recyclerView =  findViewById(R.id.listview1);
        stats = findViewById(R.id.textView3);
        gallery = findViewById(R.id.gallery);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tabletennisactivity.this, tabbletennisgallery.class));
            }
        });
        team = findViewById(R.id.textView4);
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tabletennisactivity.this, Ttstats.class));
            }
        });
        reg = (TextView)findViewById(R.id.registration);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSeFTaU1LsU0Z7r-yp25DufJlwKhOD6QD2yymLNH0-wQAudWyw/viewform?c=0&w=1");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        initRecyclerView();

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
