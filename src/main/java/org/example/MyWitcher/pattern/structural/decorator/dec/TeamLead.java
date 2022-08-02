package org.example.MyWitcher.pattern.structural.decorator.dec;

import org.example.MyWitcher.pattern.structural.decorator.model.Developer;

public class TeamLead extends DeveloperDecorator {
    public TeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "\nSend week report";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
