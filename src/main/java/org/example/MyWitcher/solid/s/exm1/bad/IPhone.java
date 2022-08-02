package org.example.MyWitcher.solid.s.exm1.bad;

public interface IPhone {
    // Отвечают за взять
    void call(String phoneNumber);
    void disconnect();

    // Отвечают за информацию
    void send(String message);
    int receive();

    // Нарушение SRP
}
