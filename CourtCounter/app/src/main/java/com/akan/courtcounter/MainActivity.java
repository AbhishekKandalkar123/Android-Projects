package com.akan.courtcounter;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB=0;
    TextView Team_A , Team_B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threePtsA(View v){
        Team_A = findViewById(R.id.Team_A_score);
        scoreA+=3;
        Team_A.setText(String.valueOf(scoreA));
    }
    public void threePtsB(View v){
        Team_B = findViewById(R.id.Team_B_score);
        scoreB+=3;
        Team_B.setText(String.valueOf(scoreB));
    }

    public void twoPtsA(View v){
        Team_A = findViewById(R.id.Team_A_score);
        scoreA+=2;
        Team_A.setText(String.valueOf(scoreA));
    }

    public void twoPtsB(View v){
        Team_B = findViewById(R.id.Team_B_score);
        scoreB+=2;
        Team_B.setText(String.valueOf(scoreB));
    }

    public void freeThrowA(View v){
        Team_A = findViewById(R.id.Team_A_score);
        scoreA++;
        Team_A.setText(String.valueOf(scoreA));
    }
    public void freeThrowB(View v){
        Team_B = findViewById(R.id.Team_B_score);
        scoreB++;
        Team_B.setText(String.valueOf(scoreB));
    }

    public void Reset(View v){
        Team_A = findViewById(R.id.Team_A_score);
        Team_A.setText("0");

        Team_B = findViewById(R.id.Team_B_score);
        Team_B.setText("0");
    }
}