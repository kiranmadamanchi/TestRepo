package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
//        displayForTeam(8);
    }

    public void addThreeForTeamA(View view){
//        displayForTeamA(3);
        scoreTeamA = scoreTeamA + 3;
        displayForTeam(scoreTeamA);
    }

    public void addTwoForTeamA(View view){
        //displayForTeamA(2);
        scoreTeamA = scoreTeamA + 2;
        displayForTeam(scoreTeamA);
    }
    public void addOneForTeamA(View view){
        //displayForTeamA(1);
        scoreTeamA = scoreTeamA + 1;
        displayForTeam(scoreTeamA);
    }

  /*  public void displayForTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        displayForTeam(0);
    }
*/
    public void addThreeForTeamB(View view){
//        displayForTeamA(3);
        scoreTeamB = scoreTeamB + 3;
        displayForTeam(scoreTeamB);
    }

    public void addTwoForTeamB(View view){
        //displayForTeamA(2);
        scoreTeamB = scoreTeamB + 2;
        displayForTeam(scoreTeamB);
    }
    public void addOneForTeamB(View view){
        //displayForTeamA(1);
        scoreTeamB = scoreTeamB + 1;
        displayForTeam(scoreTeamB);
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeam(scoreTeamA);
        displayForTeam(scoreTeamB);
    }
}
