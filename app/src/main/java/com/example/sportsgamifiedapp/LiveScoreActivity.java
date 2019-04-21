package com.example.sportsgamifiedapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LiveScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_score);

        //allows user to navigate back to main screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //allows user to navigate back to main screen
    @Override
    public boolean onNavigateUp(){
        finish();
        return true;
    }
}
