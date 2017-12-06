package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.courtcounter.R;



public class MainActivity extends AppCompatActivity {

    int team_a_score = 0;
    int team_b_score = 0;
    int team_a_foul = 0;
    int team_b_foul = 0;
    int YellowA = 0;
    int YellowB = 0;
    int RedA = 0;
    int RedB = 0;
    int PenaltyA = 0;
    int PenaltyB = 0;
    int CornerA = 0;
    int CornerB = 0;
    int OffsideA = 0;
    int OffsideB = 0;


    @Override




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA (team_a_score);
        displayForTeamB (team_b_score);
        displayFoulTeamA (team_a_foul);
        displayFoulTeamB (team_b_foul);
        displayYellowA (YellowA);
        displayYellowB(YellowB);
        displayRedA (RedA);
        displayRedB (RedB);
        displayPenaltyA (PenaltyA);
        displayPenaltyB (PenaltyB);
        displayCornerA (CornerA);
        displayCornerB (CornerB);
        displayOffsideA (OffsideA);
        displayOffsideB (OffsideB);

        if (savedInstanceState != null){




        team_a_score = savedInstanceState.getInt("team_a_score");
        displayForTeamA(team_a_score);
        team_b_score = savedInstanceState.getInt("team_b_score");
        displayForTeamB(team_b_score);

        team_a_foul = savedInstanceState.getInt("team_a_foul");
        displayFoulTeamA(team_a_foul);
        team_b_foul = savedInstanceState.getInt("team_b_foul");
        displayFoulTeamB(team_b_foul);

        YellowA = savedInstanceState.getInt("YellowA");
        displayYellowA (YellowA);
        YellowB = savedInstanceState.getInt("YellowB");
        displayYellowB(YellowB);

        RedA = savedInstanceState.getInt("RedA");
        displayRedA(RedA);
        RedB = savedInstanceState.getInt("RedB");
        displayRedB(RedB);

        PenaltyA = savedInstanceState.getInt("PenaltyA");
        displayPenaltyA (PenaltyA);
        PenaltyB = savedInstanceState.getInt("PenaltyB");
        displayPenaltyB (PenaltyB);

        CornerA = savedInstanceState.getInt("CornerA");
        displayCornerA (CornerA);
        CornerB = savedInstanceState.getInt("CornerB");
        displayCornerB (CornerB);

        OffsideA = savedInstanceState.getInt("OffsideA");
        displayOffsideA (OffsideA);
        OffsideB = savedInstanceState.getInt("OffsideB");
        displayOffsideB (OffsideB);
        }
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void increment1A(View view) {
        team_a_score = team_a_score + 1;
        displayForTeamA (team_a_score);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void increment1B(View view) {
        team_b_score = team_b_score + 1;
        displayForTeamB (team_b_score);
    }

    public void displayFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementFoulTeamA(View view) {
        team_a_foul = team_a_foul + 1;
        displayFoulTeamA (team_a_foul);
    }

    public void displayFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementFoulTeamB(View view) {
        team_b_foul = team_b_foul + 1;
        displayFoulTeamB (team_b_foul);
    }


    public void displayYellowA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.YellowA);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementYellowA(View view) {
        YellowA = YellowA + 1;
        displayYellowA (YellowA);
    }

    public void displayYellowB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.YellowB);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementYellowB(View view) {
        YellowB = YellowB + 1;
        displayYellowB (YellowB);
    }

    public void displayRedA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RedA);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementRedA(View view) {
        RedA = RedA + 1;
        displayRedA (RedA);
    }

    public void displayRedB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RedB);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementRedB(View view) {
        RedB = RedB + 1;
        displayRedB (RedB);
    }

    public void displayPenaltyA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PenaltyA);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementPenaltyA(View view) {
        PenaltyA = PenaltyA + 1;
        displayPenaltyA (PenaltyA);
    }

    public void displayPenaltyB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PenaltyB);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementPenaltyB(View view) {
        PenaltyB = PenaltyB + 1;
        displayPenaltyB (PenaltyB);
    }

    public void displayCornerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.CornerA);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementCornerA(View view) {
        CornerA = CornerA + 1;
        displayCornerA (CornerA);
    }

    public void displayCornerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.CornerB);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementCornerB(View view) {
        CornerB = CornerB + 1;
        displayCornerB (CornerB);
    }

    public void displayOffsideA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.OffsideA);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementOffsideA(View view) {
        OffsideA = OffsideA + 1;
        displayOffsideA (OffsideA);
    }

    public void displayOffsideB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.OffsideB);
        scoreView.setText(String.valueOf(score));
    }
    public void incrementOffsideB(View view) {
        OffsideB = OffsideB + 1;
        displayOffsideB (OffsideB);
    }


    public void reset(View view) {
        team_b_score = 0;
        team_a_score = 0;
        team_a_foul = 0;
        team_b_foul = 0;
        YellowA = 0;
        YellowB = 0;
        RedA = 0;
        RedB = 0;
        PenaltyA = 0;
        PenaltyB = 0;
        CornerA = 0;
        CornerB = 0;
        OffsideA = 0;
        OffsideB = 0;


        displayForTeamB (team_b_score);
        displayForTeamA (team_a_score);
        displayFoulTeamA (team_a_foul);
        displayFoulTeamB (team_b_foul);
        displayYellowA (YellowA);
        displayYellowB (YellowA);
        displayRedA (RedA);
        displayRedB (RedB);
        displayPenaltyA (PenaltyA);
        displayPenaltyB (PenaltyB);
        displayCornerA (CornerA);
        displayCornerB (CornerB);
        displayOffsideA (OffsideA);
        displayOffsideB (OffsideB);
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the state of item position
        outState.putInt("team_a_score", team_a_score);
        outState.putInt("team_b_score", team_b_score);
        outState.putInt("team_a_foul", team_a_foul);
        outState.putInt("team_b_foul", team_b_foul);
        outState.putInt("YellowA", YellowA);
        outState.putInt("YellowB", YellowB);
        outState.putInt("RedA", RedA);
        outState.putInt("RedB", RedB);
        outState.putInt("PenaltyA", PenaltyA);
        outState.putInt("PenaltyB", PenaltyB);
        outState.putInt("CornerA", CornerA);
        outState.putInt("CornerB", CornerB);
        outState.putInt("OffsideA", OffsideA);
        outState.putInt("OffsideB",OffsideB);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Read the state of item position
        team_a_score = savedInstanceState.getInt("team_a_score");
        team_b_score = savedInstanceState.getInt("team_b_score");
        team_a_foul = savedInstanceState.getInt("team_a_foul");
        team_b_foul = savedInstanceState.getInt("team_b_foul");
        YellowA = savedInstanceState.getInt("YellowA");
        YellowB = savedInstanceState.getInt("YellowB");
        RedA = savedInstanceState.getInt("RedA");
        RedB = savedInstanceState.getInt("RedB");
        PenaltyA = savedInstanceState.getInt("PenaltyA");
        PenaltyB = savedInstanceState.getInt("PenaltyB");
        CornerA = savedInstanceState.getInt("CornerA");
        CornerB = savedInstanceState.getInt("CornerB");
        OffsideA = savedInstanceState.getInt("OffsideA");
        OffsideB = savedInstanceState.getInt("OffsideB");
    }

}