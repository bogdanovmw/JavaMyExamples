package org.example.MyWitcher.solid.dip.exp1.good;

public class LoginManager {
    private IAuth auth;

    public LoginManager(IAuth auth) {
        this.auth = auth;
    }

    public void login(User user) {
        auth.auth(user);
    }
}
