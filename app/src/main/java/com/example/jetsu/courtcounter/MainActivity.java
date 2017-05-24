package com.example.jetsu.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA;
    private int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3PointsTeamA(View view){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void add2PointsTeamA(View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void add1PointTeamA(View view)
    {
        scoreA++;
        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3PointsTeamB(View view){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void add2PointsTeamB(View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void add1PointTeamB(View view)
    {
        scoreB++;
        displayForTeamB(scoreB);
    }

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
