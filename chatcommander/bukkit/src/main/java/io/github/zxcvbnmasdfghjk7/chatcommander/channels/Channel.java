package io.github.zxcvbnmasdfghjk7.chatcommander.channels;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Channel {

    private UUID channelID;
    private String channelName;
    private Map<UUID, String> messages;

    public Channel(UUID channelID, String channelName){
        setChannelID(channelID);
        setChannelName(channelName);
        setMessages(new HashMap<>());
    }

    public UUID getChannelID() {
        return channelID;
    }

    public void setChannelID(UUID channelID) {
        this.channelID = channelID;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Map<UUID, String> getMessages() {
        return messages;
    }

    public void setMessages(Map<UUID, String> messages) {
        this.messages = messages;
    }
}
