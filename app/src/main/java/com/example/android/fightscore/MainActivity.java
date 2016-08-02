package com.example.android.fightscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double scoreOpponentA = 0;
    double scoreOpponentB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Resets score for Opponent A and Opponent B to zero
     */

    public void resetScore(View v) {
        scoreOpponentA = 0;
        scoreOpponentB = 0;
        displayForOpponentA(scoreOpponentA);
        displayForOpponentB(scoreOpponentB);
    }

    /**
     * Displays the given score for Opponent A.
     */
    public void displayForOpponentA(double score) {
        TextView scoreView = (TextView) findViewById(R.id.opponent_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds +0.5 point (take down) for Opponent A.
     */
    public void addHalfForOpponentA(View v) {
        scoreOpponentA = scoreOpponentA + 0.5;
        displayForOpponentA(scoreOpponentA);
    }

    /**
     * Adds +2 points (kick) for Opponent A.
     */
    public void addTwoForOpponentA(View v) {
        scoreOpponentA = scoreOpponentA + 2;
        displayForOpponentA(scoreOpponentA);
    }

    /**
     * Adds +1 point (punch) for Opponent A.
     */
    public void addOneForOpponentA(View v) {
        scoreOpponentA = scoreOpponentA + 1;
        displayForOpponentA(scoreOpponentA);
    }

    /**
     * Subtracts 1 point (illegal move) for Opponent A.
     */
    public void subtractOneForOpponentA(View v) {
        scoreOpponentA = scoreOpponentA - 1;
        displayForOpponentA(scoreOpponentA);
    }

    /**
     * Displays the given score for Opponent B.
     */
    public void displayForOpponentB(double score) {
        TextView scoreView = (TextView) findViewById(R.id.opponent_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds +0.5 point (take down) for Opponent B.
     */
    public void addHalfForOpponentB(View v) {
        scoreOpponentB = scoreOpponentB + 0.5;
        displayForOpponentB(scoreOpponentB);
    }

    /**
     * Adds +2 points (kick) for Opponent B.
     */
    public void addTwoForOpponentB(View v) {
        scoreOpponentB = scoreOpponentB + 2;
        displayForOpponentB(scoreOpponentB);
    }

    /**
     * Adds +1 point (punch) for Opponent B.
     */
    public void addOneForOpponentB(View v) {
        scoreOpponentB = scoreOpponentB + 1;
        displayForOpponentB(scoreOpponentB);
    }

    /**
     * Subtracts 1 point (illegal move) for Opponent B.
     */
    public void subtractOneForOpponentB(View v) {
        scoreOpponentB = scoreOpponentB - 1;
        displayForOpponentB(scoreOpponentB);
    }


}


