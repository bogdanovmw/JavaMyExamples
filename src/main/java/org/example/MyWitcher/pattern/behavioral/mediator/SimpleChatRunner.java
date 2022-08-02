package org.example.MyWitcher.pattern.behavioral.mediator;

import org.example.MyWitcher.pattern.behavioral.mediator.model.Admin;
import org.example.MyWitcher.pattern.behavioral.mediator.model.SimpleUser;
import org.example.MyWitcher.pattern.behavioral.mediator.model.User;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello User 1");
        admin.sendMessage("Im Admin");
    }
}
