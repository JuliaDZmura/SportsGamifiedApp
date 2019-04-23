package com.example.sportsgamifiedapp;

public class LiveScoreHTeam {

    private LiveScoreScore score;
    private String teamId;

    public LiveScoreScore getScore() {
        return score;
    }

    public void setScore(LiveScoreScore score) {
        this.score = score;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}