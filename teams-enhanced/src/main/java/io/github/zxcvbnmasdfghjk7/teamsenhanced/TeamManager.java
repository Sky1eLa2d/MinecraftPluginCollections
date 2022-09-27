package io.github.zxcvbnmasdfghjk7.teamsenhanced;

import io.github.zxcvbnmasdfghjk7.teamsenhanced.data.Team;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TeamManager {

    private Map<UUID, Team> teams;

    public TeamManager(){
        setTeams(new HashMap<>());
    }

    public Map<UUID, Team> getTeams() {
        return teams;
    }

    public void setTeams(Map<UUID, Team> teams) {
        this.teams = teams;
    }
}
