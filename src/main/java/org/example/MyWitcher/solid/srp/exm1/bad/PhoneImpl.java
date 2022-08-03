package org.example.MyWitcher.solid.srp.exm1.bad;

public class PhoneImpl implements IPhone {
    @Override
    public void call(String phoneNumber) {
        System.out.println("Connected true: " + phoneNumber);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected!");
    }

    @Override
    public void send(String message) {
        System.out.println("Data send successfully: " + message);
    }

    @Override
    public int receive() {
        System.out.println("Data received successfully");
        return 0;
    }
}
