package com.example.sportsgamifiedapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface LiveScoreApi {

    @Headers({
            "X-RapidAPI-Host: api-nba-v1.p.rapidapi.com",
            "X-RapidAPI-Key: 8f9c77495dmsh889c021b261eb45p1c6fb0jsn57f722b70421"
    })

    @GET("games/live")
    Call<List<LiveScoreResponse>> getGames();
}
