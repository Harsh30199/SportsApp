package com.example.amitb.sportsapp;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] titles = {"MOST RUNS",
            "MAXIMUM SIXES",
            "HIGHEST SCORE",
            "MOST WICKETS",
            "BEST BOWLING FIGURES"};

    private String[] details = {"Ruchit Ramolia     ",
            "Ruchit Ramolia     ", "Arvind     ",
            "Hardik Singh     ", "Sahil     "};

    private int[] images = { R.drawable.face,
            R.drawable.face,
            R.drawable.face,
            R.drawable.face,
            R.drawable.face};

    private String[] stat = {"464 runs", "20 sixes","175*","154 wickets", "6/14"};

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemStat;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail = (TextView)itemView.findViewById(R.id.item_detail);
            itemStat = (TextView)itemView.findViewById(R.id.item_stat);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardlayout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
        viewHolder.itemStat.setText(stat[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}