package org.example.MyWitcher.pattern.structural.facade.bad;

public class SpringRunner {
    public static void main(String[] args) {
        Job job = new Job();
        job.doJob();

        Developer developer = new Developer();

        BugTracker bugTracker = new BugTracker();

        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);

        bugTracker.spotSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
