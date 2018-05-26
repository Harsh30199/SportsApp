package com.example.amitb.sportsapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class SportsAdapter extends RecyclerView.Adapter<SportsAdapter.MessagesViewHolder> {
    private LayoutInflater inflater;
    private List<sportlayout> sport;

    public SportsAdapter(LayoutInflater inflater, List<sportlayout> sport) {
        this.inflater = inflater;
        this.sport = sport;
    }

    @Override
    public MessagesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemsport = inflater.inflate(R.layout.sportlayout, parent, false);
        MessagesViewHolder messagesViewHolder = new MessagesViewHolder(itemsport);
        messagesViewHolder.view = itemsport;
        messagesViewHolder.team1 = (TextView) itemsport.findViewById(R.id.team1);
        messagesViewHolder.team2 = (TextView) itemsport.findViewById(R.id.team2);
        messagesViewHolder.score1 = (TextView) itemsport.findViewById(R.id.score1);
        messagesViewHolder.score2 = itemsport.findViewById(R.id.score2);
        messagesViewHolder.venue = itemsport.findViewById(R.id.venue);
        messagesViewHolder.result = itemsport.findViewById(R.id.result);

        return messagesViewHolder;
    }

    @Override
    public void onBindViewHolder(MessagesViewHolder holder,int position) {
        sportlayout s = sport.get(position);
        holder.team1.setText(s.getTeam1());
        holder.team2.setText(s.getTeam2());
        holder.score1.setText(s.getScore1());
        holder.score2.setText(s.getScore2());
        holder.result.setText(s.getResult());
        holder.venue.setText(s.getVenue());
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return sport.size();
    }

    public static class MessagesViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView team1 ,team2 , score1 , score2 , result , venue;
        int position;

        public MessagesViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
        }
    }
}