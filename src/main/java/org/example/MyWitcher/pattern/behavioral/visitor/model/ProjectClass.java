package org.example.MyWitcher.pattern.behavioral.visitor.model;

import org.example.MyWitcher.pattern.behavioral.visitor.model2.Developer;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
