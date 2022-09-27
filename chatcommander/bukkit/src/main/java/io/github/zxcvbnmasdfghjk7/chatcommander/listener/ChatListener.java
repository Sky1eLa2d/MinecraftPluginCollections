package io.github.zxcvbnmasdfghjk7.chatcommander.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    public void onPlayerChatEvent(AsyncPlayerChatEvent event){
        String message = event.getMessage();
    }
}
