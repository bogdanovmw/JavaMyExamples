package org.example.MyWitcher.pattern.structural.composite;

import org.example.MyWitcher.pattern.structural.composite.dev.CppDeveloper;
import org.example.MyWitcher.pattern.structural.composite.dev.Developer;
import org.example.MyWitcher.pattern.structural.composite.dev.JavaDeveloper;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();
        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer firstCppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(firstCppDeveloper);

        team.createProject();
    }
}
