package org.example.MyWitcher.pattern.structural.facade.bad;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if (bugTracker.isActiveSpring()){
            System.out.println("Developer is solving problems ...");
        }else {
            System.out.println("Developer is reading Habrhabr ...");
        }
    }
}
