package org.example.MyWitcher.pattern.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Name: " + name);
        vacancies.forEach(System.out::println);
        System.out.println("");
    }
}
