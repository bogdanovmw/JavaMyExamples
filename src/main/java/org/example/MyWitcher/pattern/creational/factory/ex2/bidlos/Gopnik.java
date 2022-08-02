package org.example.MyWitcher.pattern.creational.factory.ex2.bidlos;

public class Gopnik implements IBidlo {
    @Override
    public void batleRoad() {
        System.out.println("Есть чё позвонить?");
    }

    @Override
    public String toString() {
        return "Gopnik";
    }
}
