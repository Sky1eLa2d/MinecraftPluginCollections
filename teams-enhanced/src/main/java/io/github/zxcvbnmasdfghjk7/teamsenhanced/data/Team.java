package io.github.zxcvbnmasdfghjk7.teamsenhanced.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Team {

    private String teamName;
    private UUID teamUUID;
    private List<Player> playersInTeam;
    private UUID playerUUIDLeader;

    public Team(String teamName){
        setTeamName(teamName);
        setTeamUUID(teamUUID);
        setPlayersInTeam(new ArrayList<>());
        setPlayerUUIDLeader(null);
    }

    public List<Player> getPlayersInTeam() {
        return playersInTeam;
    }

    public void setPlayersInTeam(List<Player> playersInTeam) {
        this.playersInTeam = playersInTeam;
    }

    public UUID getPlayerUUIDLeader() {
        return playerUUIDLeader;
    }

    public void setPlayerUUIDLeader(UUID playerUUIDLeader) {
        this.playerUUIDLeader = playerUUIDLeader;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public UUID getTeamUUID() {
        return teamUUID;
    }

    public void setTeamUUID(UUID teamUUID) {
        this.teamUUID = teamUUID;
    }
}
