package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTeamA, mTeamB;
    int mTeamAPoints=0, mTeamBPoints=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonFunctions();
        Button reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamAPoints =0;
                mTeamBPoints =0;
                mTeamA.setText("0");
                mTeamB.setText("0");
            }
        });
    }
    private void buttonFunctions(){
        teamAFunctions();
        teamBFunctions();
    }
    private void teamAFunctions(){
        mTeamA = (TextView) findViewById(R.id.teamApoints);
        Button points3 = (Button) findViewById(R.id.points3A);
        Button points2 = (Button) findViewById(R.id.points2A);
        Button points1 = (Button) findViewById(R.id.point1A);


        points3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamAPoints +=3;
                mTeamA.setText(Integer.toString(mTeamAPoints));
            }
        });
        points2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamAPoints += 2;
                mTeamA.setText(Integer.toString(mTeamAPoints));
            }
        });
        points1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamAPoints += 1;
                mTeamA.setText(Integer.toString(mTeamAPoints));
            }
        });

    }
    private void teamBFunctions(){
        mTeamB = (TextView) findViewById(R.id.teamBpoints);
        Button points3 = (Button) findViewById(R.id.points3B);
        Button points2 = (Button) findViewById(R.id.points2B);
        Button points1 = (Button) findViewById(R.id.point1B);

        points3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamBPoints +=3;
                mTeamB.setText(Integer.toString(mTeamBPoints));
            }
        });
        points2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamBPoints += 2;
                mTeamB.setText(Integer.toString(mTeamBPoints));
            }
        });
        points1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTeamBPoints += 1;
                mTeamB.setText(Integer.toString(mTeamBPoints));
            }
        });

    }
}