package org.example.MyWitcher.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String name){
        vacancies.add(name);
        notifyObservers();
    }

    public void removeVacancy(String name){
        vacancies.remove(name);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(vacancies);
        }
    }
}
