package org.example.MyWitcher.pattern.structural.decorator;

import org.example.MyWitcher.pattern.structural.decorator.dec.SeniorDeveloper;
import org.example.MyWitcher.pattern.structural.decorator.dec.TeamLead;
import org.example.MyWitcher.pattern.structural.decorator.model.Developer;
import org.example.MyWitcher.pattern.structural.decorator.model.JavaDeveloper;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        System.out.println(developer.makeJob());

        Developer senior = new SeniorDeveloper(new JavaDeveloper());
        System.out.println(senior.makeJob());

        System.out.println();

        Developer teamLead = new TeamLead(new SeniorDeveloper(new JavaDeveloper()));
        System.out.println(teamLead.makeJob());

        System.out.println();

        Developer exmpl = new SeniorDeveloper(new TeamLead(new JavaDeveloper()));
        System.out.println(exmpl.makeJob());
    }
}
