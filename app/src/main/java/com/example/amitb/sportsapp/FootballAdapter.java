package com.example.amitb.sportsapp;

/**
 * Created by amitb on 4/22/2018.
 */
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FootballAdapter extends RecyclerView.Adapter<FootballAdapter.ViewHolder> {

    private String[] titles = {"MOST GOALS",
            "MOST ASSISTS",
            "MOST CLEAN SHEETS",
    "MOST CARDS"};

    private String[] details = {"Tarun Shah     ",
            "Karan Khanna     ", "Tushar Singh     ","KJ COLLEGE     "};

    private int[] images = { R.drawable.face,
            R.drawable.face,
            R.drawable.face,
    R.drawable.face};

    private String[] stat = {"8 goals", "7 assists","4 clean sheets","7 yellow 2 red"};

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage1;
        public TextView itemTitle1;
        public TextView itemStat1;
        public TextView itemDetail1;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage1 = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle1 = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail1 = (TextView)itemView.findViewById(R.id.item_detail);
            itemStat1 = (TextView)itemView.findViewById(R.id.item_stat);

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
        viewHolder.itemTitle1.setText(titles[i]);
        viewHolder.itemDetail1.setText(details[i]);
        viewHolder.itemImage1.setImageResource(images[i]);
        viewHolder.itemStat1.setText(stat[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}

