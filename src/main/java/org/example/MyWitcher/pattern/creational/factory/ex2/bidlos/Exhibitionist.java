package org.example.MyWitcher.pattern.creational.factory.ex2.bidlos;

public class Exhibitionist implements IBidlo {
    @Override
    public void batleRoad() {
        System.out.println("Здрасте, а вот что у меня под плащом");
    }

    @Override
    public String toString() {
        return "Exhibitionist";
    }
}
