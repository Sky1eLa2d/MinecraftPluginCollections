package io.github.zxcvbnmasdfghjk7.chatcommander.channels;

import java.util.HashMap;
import java.util.Map;

public class ChatManager {

    private final Map<String, Channel> channels;


    public ChatManager(){
        channels = new HashMap<>();
    }



    public Map<String, Channel> getChannels() {
        return channels;
    }
}
