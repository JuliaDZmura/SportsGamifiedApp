package com.example.sportsgamifiedapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LiveScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_score);

        //allows user to navigate back to main screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //implements UI elements, Button and TextView
        final Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textView);

        Log.d("SPORTIFY", "Set variables");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("SPORTIFY", "Registered click");


                // implements Retrofit2, connects to API-NBA
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://api-nba-v1.p.rapidapi.com/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                Log.d("SPORTIFY", "Set Retrofit2");

                LiveScoreApi liveScoreApi = retrofit.create(LiveScoreApi.class);

                Log.d("SPORTIFY", "Set LiveScoreApi");

                Call<List<LiveScoreResponse>> call = liveScoreApi.getGames();

                Log.d("SPORTIFY", "Connected to API-NBA");

                call.enqueue(new Callback<List<LiveScoreResponse>>() {

                    @Override
                    public void onResponse(Call<List<LiveScoreResponse>> call, Response<List<LiveScoreResponse>> response) {

                        Log.d("SPORTIFY", "Response success");

                        if (!response.isSuccessful()) {
                            textView.setText("Code: " + response.code());
                            return;
                        }

                        //returns live game's teams and scores
                        List<LiveScoreResponse> liveScoreResponses = response.body();

                        for (LiveScoreResponse liveScoreResponse : liveScoreResponses) {
                            String content = "";
                            content += "Team 1: " + liveScoreResponse.getGames().getHTeam() + "\n";
                            content += "Team 2 Score " + liveScoreResponse.getGames().getVTeam().getScore() + "\n";
                            content += "Team 2: " + liveScoreResponse.getGames().getVTeam() + "\n";
                            content += "Team 1 Score " + liveScoreResponse.getGames().getHTeam().getScore() + "\n\n";

                            textView.append(content);

                        }

                        Log.d("SPORTIFY", "Printed variables");
                    }

                    @Override
                    public void onFailure(Call<List<LiveScoreResponse>> call, Throwable t) {

                        Log.d("SPORTIFY", "Response failure");

                        textView.setText(t.getMessage());

                    }
                });
            }
        });
    }

    //allows user to navigate back to main screen
    @Override
    public boolean onNavigateUp(){
        finish();
        return true;
    }
}