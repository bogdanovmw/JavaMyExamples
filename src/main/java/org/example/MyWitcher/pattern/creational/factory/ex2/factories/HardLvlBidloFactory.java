package org.example.MyWitcher.pattern.creational.factory.ex2.factories;

import org.example.MyWitcher.pattern.creational.factory.ex2.bidlos.IBidlo;
import org.example.MyWitcher.pattern.creational.factory.ex2.bidlos.Exhibitionist;
import org.example.MyWitcher.pattern.creational.factory.ex2.bidlos.Gopnik;

import java.util.Random;

public class HardLvlBidloFactory implements IBidloFactory {
    private static Random rnd = new Random();

    @Override
    public IBidlo create() throws Exception {
        String[] bidlos = new String[] { "Нудист", "Гопник" };

        switch (bidlos[rnd.nextInt(bidlos.length)])
        {
            case "Нудист":
                return new Exhibitionist();
            case "Гопник":
                return new Gopnik();
            default:
                throw new Exception("Таких конкретных классов нет D:");
        }
    }
}
