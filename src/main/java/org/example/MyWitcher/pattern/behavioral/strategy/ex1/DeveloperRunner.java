package org.example.MyWitcher.pattern.behavioral.strategy.ex1;

import org.example.MyWitcher.pattern.behavioral.strategy.ex1.model.Coding;
import org.example.MyWitcher.pattern.behavioral.strategy.ex1.model.Sleeping;
import org.example.MyWitcher.pattern.behavioral.strategy.ex1.model.Training;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
