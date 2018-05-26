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

public class badmintonactivity extends AppCompatActivity {

    private ArrayList<sportlayout> arrayList = new ArrayList<>();
    private LinearLayoutManager layoutManager ;
    private RecyclerView recyclerView;
    cricketactivity.propertyArrayAdapter adapter ;
    AnimationDrawable animationDrawable;
    ExpandableListView expandableListView;
    RelativeLayout relativeLayout;
    private TextView stats,reg,gallery;
    private TextView team ;
    Uri uri;
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("BADMINTON");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badmintonactivity);
        arrayList.add(new sportlayout("KETAN PATNI                        (21-16 15-21 17-21)", "AKSHAY MANWADKAR", "1", "2", "WINNER: AKSHAY MANWADKAR", "MENS SINGLES: FINALS"));
        arrayList.add(new sportlayout("ROOP THAKKAR                        (19-21 15-21 17-21)", "ASHWATI IYER", "3", "0", "WINNER: ROOP THAKKAR", "WOMENS SINGLES: FINALS"));
        arrayList.add(new sportlayout("HARSH/SHUBRIT                        (21-12 17-21 17-21)", "AMARTYA/KANAK", "1", "2", "WINNER: AMARTYA/KANAK", "MENS DOUBLES: FINALS"));
        arrayList.add(new sportlayout("AMULYA/ASHWATI                        (21-16 15-21 17-21)", "ROOP/RADHIKA", "1", "2", "WINNER: ROOP/RADHIKA", "WOMENS DOUBLES: FINALS"));
        arrayList.add(new sportlayout("JAGTIK/SANJANA                        (14-21 15-21 17-21)", "VARAD/NEHALI", "3", "0", "WINNER: JAGTIK/SANJANA", "MIXED DOUBLES: FINALS"));

        gallery = findViewById(R.id.gallery);
        relativeLayout = findViewById(R.id.rel);
        recyclerView =  findViewById(R.id.listview1);
        stats = findViewById(R.id.textView3);
        team = findViewById(R.id.textView4);

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(badmintonactivity.this, badmintongallery.class));
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(badmintonactivity.this, badmintonstats.class));
            }
        });

        initRecyclerView();
        reg = (TextView)findViewById(R.id.registration);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfVOsoOvylGaLuR1z9zsDynLfl8ZjdXOjGURDLRv6X5JkjAJg/viewform?c=0&w=1");
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