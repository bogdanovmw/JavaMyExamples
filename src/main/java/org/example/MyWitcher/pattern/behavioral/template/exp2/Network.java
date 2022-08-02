package org.example.MyWitcher.pattern.behavioral.template.exp2;

public abstract class Network {
    protected String username;
    protected String password;

    public boolean post(String message) {
        if (logIn(username, password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String username, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
