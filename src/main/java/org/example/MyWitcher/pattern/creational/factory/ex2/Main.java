package org.example.MyWitcher.pattern.creational.factory.ex2;

import org.example.MyWitcher.pattern.creational.factory.ex2.bidlos.IBidlo;
import org.example.MyWitcher.pattern.creational.factory.ex2.factories.EzLvlBidloFactory;
import org.example.MyWitcher.pattern.creational.factory.ex2.factories.HardLvlBidloFactory;
import org.example.MyWitcher.pattern.creational.factory.ex2.factories.IBidloFactory;
import org.example.MyWitcher.pattern.creational.factory.ex2.factories.MidleLvlBidloFactory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
//        startGame(new EzLvlBidloFactory());
//        startGame(new MidleLvlBidloFactory());
//        startGame(new HardLvlBidloFactory());

        IBidlo[] iBidlos = startGame(new EzLvlBidloFactory());
        Arrays.stream(iBidlos).forEach(System.out::println);
    }

    private static IBidlo[] startGame(IBidloFactory factory) throws Exception {
        IBidlo[] bidlos = new IBidlo[5]; // Задаём список монстров на локации

        for(int i = 0; i < bidlos.length; i++) {
            bidlos[i] = factory.create(); // заполнение массива делегировано фабричному методу
        }

        return bidlos;
    }
}
