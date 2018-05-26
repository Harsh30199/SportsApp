package com.example.amitb.sportsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class cricketactivity extends AppCompatActivity {

    private ArrayList<sportlayout> arrayList = new ArrayList<>();
    private LinearLayoutManager layoutManager ;
    private RecyclerView recyclerView;
    propertyArrayAdapter adapter ;
    AnimationDrawable animationDrawable;
    ExpandableListView expandableListView;
    RelativeLayout relativeLayout;
    private TextView stats,reg, gallery;
    private TextView team ;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setTitle("CRICKET");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricketactivity3);

        arrayList.add(new sportlayout("ICT", "RJ COLLEGE", "130/5", "131/4", "RJ COLLEGE WON BY 6 WICKETS", "MATUNGA GYMKHANA"));
        arrayList.add(new sportlayout("VJTI", "SIES", "139/5", "140/5", "SIES WON BY 5 WICKETS", "MATUNGA GYMKHANA"));
        arrayList.add(new sportlayout("RIZVI COLLEGE", "SINHAGAD", "130/5", "131/4", "SINHAGAD WON BY 6 WICKETS", "MATUNGA GYMKHANA"));
        arrayList.add(new sportlayout("KHALSA", "RAIT", "130/5", "131/4", "RAIT WON BY 6 WICKETS", "MATUNGA GYMKHANA"));
        arrayList.add(new sportlayout("MPSTME B", "KJ COLLEGE", "130/5", "131/4", "KJ COLLEGE WON BY 6 WICKETS", "MATUNGA GYMKHANA"));

        relativeLayout = findViewById(R.id.rel);
        recyclerView =  findViewById(R.id.listview1);
        stats = findViewById(R.id.textView3);
        gallery = findViewById(R.id.gallery);
        team = findViewById(R.id.textView4);


        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cricketactivity.this, cricketgallery.class));
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cricketactivity.this, stats.class));
            }
        });
        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cricketactivity.this,team.class));
            }
        });
     initRecyclerView();
        reg = (TextView)findViewById(R.id.registration);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdLHyrE98cMgaie8BF4vg-rCyg1xXairwnwMxdp0bH4a7DSmw/viewform?c=0&w=1");
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



