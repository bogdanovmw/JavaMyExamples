package org.example.MyWitcher.solid.srp.exm1.good;

public class PhoneClient {
    public static void main(String[] args) {
        Phone iPhone = new Phone(new ConnectionManagerImpl(), new DataManagerImpl());
        iPhone.call("Hello World!");
        iPhone.send("Fuck You!");
        iPhone.receive();
        iPhone.disconnect();
    }
}
