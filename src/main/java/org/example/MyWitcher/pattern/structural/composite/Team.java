package org.example.MyWitcher.pattern.structural.composite;

import org.example.MyWitcher.pattern.structural.composite.dev.Developer;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void createProject() {
        System.out.println("Team create Project");
        developers.forEach(Developer::writeCode);
    }

    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }
}
