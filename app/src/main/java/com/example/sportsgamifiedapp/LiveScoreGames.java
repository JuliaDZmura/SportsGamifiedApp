package com.example.sportsgamifiedapp;

public class LiveScoreGames {

    private String gameId;
    private LiveScoreHTeam hTeam;
    private LiveScoreVTeam vTeam;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public LiveScoreHTeam getHTeam() {
        return hTeam;
    }

    public void setHTeam(LiveScoreHTeam hTeam) {
        this.hTeam = hTeam;
    }

    public LiveScoreVTeam getVTeam() {
        return vTeam;
    }

    public void setVTeam(LiveScoreVTeam vTeam) {
        this.vTeam = vTeam;
    }
}
