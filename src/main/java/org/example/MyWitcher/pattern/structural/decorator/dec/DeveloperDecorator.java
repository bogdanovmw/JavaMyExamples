package org.example.MyWitcher.pattern.structural.decorator.dec;

import org.example.MyWitcher.pattern.structural.decorator.model.Developer;

public class DeveloperDecorator implements Developer {
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
