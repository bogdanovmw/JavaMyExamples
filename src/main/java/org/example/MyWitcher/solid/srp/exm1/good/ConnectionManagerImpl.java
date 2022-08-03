package org.example.MyWitcher.solid.srp.exm1.good;

public class ConnectionManagerImpl implements IConnectionManager {
    @Override
    public void call(String phoneNumber) {
        System.out.println("Connected true: " + phoneNumber);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected!");
    }
}
