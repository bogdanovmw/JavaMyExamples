package org.example.MyWitcher.pattern.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java");
        jobSite.addVacancy("Second Java");

        Observer firstSubscriber = new Subscriber("Max");
        Observer secondSubscriber = new Subscriber("Peter");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java");
        jobSite.removeVacancy("First Java");
    }
}
