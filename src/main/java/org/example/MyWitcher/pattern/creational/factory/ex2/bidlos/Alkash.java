package org.example.MyWitcher.pattern.creational.factory.ex2.bidlos;

public class Alkash implements IBidlo {
    @Override
    public void batleRoad() {
        System.out.println("Дай пятюню, мне на проезд");
    }

    @Override
    public String toString() {
        return "Alkash";
    }
}
