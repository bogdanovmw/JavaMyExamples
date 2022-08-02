package org.example.MyWitcher.pattern.behavioral.mediator.model;

import org.example.MyWitcher.pattern.behavioral.mediator.Chat;

public class SimpleUser implements User {
    Chat chat;
    String user;

    public SimpleUser(Chat chat, String user) {
        this.chat = chat;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.user + " receiving message: " + message + ". ");
    }
}
