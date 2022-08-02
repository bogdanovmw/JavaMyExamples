package org.example.MyWitcher.pattern.behavioral.mediator;

import org.example.MyWitcher.pattern.behavioral.mediator.model.User;

public interface Chat {
    void sendMessage(String message, User user);
}
