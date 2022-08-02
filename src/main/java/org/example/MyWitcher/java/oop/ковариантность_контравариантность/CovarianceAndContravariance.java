package org.example.MyWitcher.java.oop.ковариантность_контравариантность;

import java.util.ArrayList;

public class CovarianceAndContravariance {
    static class Fruit {
    }
    static class Citrus extends Fruit {
        int weight;
    }
    static class Orange extends Citrus {
    }
    static class BigRoundOrange extends Orange {
    }

    // Возможности по записи
    public static void addOranges(ArrayList<? super Orange> oranges) {
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange());
        }
//        Citrus citrus = oranges.get(0);
        Object object = oranges.get(0);

        oranges.add(new BigRoundOrange());
//        oranges.add(new Fruit());
    }

    // Возможности по чтению
    private static int totalWeight(ArrayList<? extends Citrus> oranges) {
        int weight = 0;
        for (Citrus orange : oranges) {
            weight += orange.weight;
        }
        Fruit fruit = oranges.get(0);
//        oranges.add(new Citrus()); - ошибка
        return weight;
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();

        citrus = orange;
        fruit = citrus;
        fruit = orange;

//        citrus = fruit; - ошибка
//        orange = citrus; - ошибка

        ArrayList<Citrus> citrusesList = new ArrayList<>();
        fruit = citrusesList.get(0);
        citrus = citrusesList.get(0);
//        orange = citrusesList.get(0); - ошибка

        ArrayList<Orange> orangeList = new ArrayList<>();
//        citrusesList = orangeList; - ошибка

        totalWeight(citrusesList);
        totalWeight(orangeList);

        addOranges(orangeList);
        addOranges(citrusesList);
    }
}
