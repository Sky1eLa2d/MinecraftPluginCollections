package io.github.zxcvbnmasdfghjk7.teamsenhanced.data;

import java.util.UUID;

public class Player {

    private UUID playerUUID;
    private Role role;

    public Player(UUID playerUUID){
        this.playerUUID = playerUUID;
        this.role = Role.NOT_MEMBER;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }

    public void setPlayerUUID(UUID playerUUID) {
        this.playerUUID = playerUUID;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
