package org.example.MyWitcher.solid.s.exm1.bad;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone iPhone = new PhoneImpl();
        iPhone.call("Hello World!");
        iPhone.send("Fuck You!");
        iPhone.receive();
        iPhone.disconnect();
    }
}
