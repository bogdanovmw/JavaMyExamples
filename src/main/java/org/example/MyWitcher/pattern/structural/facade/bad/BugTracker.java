package org.example.MyWitcher.pattern.structural.facade.bad;

public class BugTracker {
    private boolean activeSpring;

    public boolean isActiveSpring() {
        return activeSpring;
    }

    public void startSprint(){
        System.out.println("Start !!!");
        activeSpring = true;
    }

    public void spotSprint(){
        System.out.println("Stop !!!");
        activeSpring = false;
    }
}
