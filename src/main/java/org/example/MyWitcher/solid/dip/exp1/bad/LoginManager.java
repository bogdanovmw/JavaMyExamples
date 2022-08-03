package org.example.MyWitcher.solid.dip.exp1.bad;

// High level class
public class LoginManager {
    private SimpleLogin simpleLogin = new SimpleLogin(); // сильно зависимый

    public void login(User user) {
        simpleLogin.auth(user);
    }
}
