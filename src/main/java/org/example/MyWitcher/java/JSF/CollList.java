package org.example.MyWitcher.java.JSF;

import com.github.javafaker.Faker;
import org.example.MyWitcher.java.JSF.model.Cat;
import org.example.MyWitcher.java.JSF.model.Dog;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class CollList {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        sysTime();
    }

    private static void sysTime() {
        Date start = new Date();
        ArrayList<Dog> dogs = getDogs();
        Date finish = new Date();
        System.out.println("Start: " + start.getTime() + ", finish: " + finish.getTime() + " = " + (finish.getTime() - start.getTime()));

        start = new Date();
        LinkedList<Cat> cats = getCats();
        finish = new Date();
        System.out.println("Start: " + start.getTime() + ", finish: " + finish.getTime() + " = " + (finish.getTime() - start.getTime()));
    }

    private static ArrayList<Dog> getDogs() {
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            dogs.add(new Dog(i, FAKER.cat().name(), FAKER.cat().breed(), FAKER.cat().registry()));
        }
        return dogs;
    }

    private static LinkedList<Cat> getCats() {
        LinkedList<Cat> cats = new LinkedList<>();
        for (int i = 0; i < 10_000_000; i++) {
            cats.add(new Cat(i, FAKER.cat().name(), FAKER.cat().breed(), FAKER.cat().registry()));
        }
        return cats;
    }
}
