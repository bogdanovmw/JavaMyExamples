package org.example.MyWitcher.pattern.creational.factory.ex2.factories;

import org.example.MyWitcher.pattern.creational.factory.ex2.bidlos.IBidlo;
import org.example.MyWitcher.pattern.creational.factory.ex2.bidlos.Gopnik;

public class MidleLvlBidloFactory implements IBidloFactory {
    private static int hardBidloCount = 0;

    @Override
    public IBidlo create() throws Exception {
        if(hardBidloCount < 10)
        {
            hardBidloCount += 1;
            return new Gopnik();
        }

        IBidloFactory ezFactory = new EzLvlBidloFactory();
        return ezFactory.create();
    }
}
