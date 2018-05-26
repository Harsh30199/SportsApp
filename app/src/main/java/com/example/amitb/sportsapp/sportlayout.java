package com.example.amitb.sportsapp;

/**
 * Created by amitb on 3/30/2018.
 */

public class sportlayout
{
    String team1, team2, score1, score2, result, venue;
    public sportlayout (String team1,String team2,String score1,String score2,String result,String venue)
    {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        this.result = result;
        this.venue = venue;

    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getScore1() {
        return score1;
    }

    public String getScore2() {
        return score2;
    }

    public String getResult() {
        return result;
    }

    public String getVenue() {
        return venue;
    }
}
