package org.example.MyWitcher.pattern.structural.decorator.dec;

import org.example.MyWitcher.pattern.structural.decorator.model.Developer;

public class SeniorDeveloper extends DeveloperDecorator{
    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "\nMake code review!";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
