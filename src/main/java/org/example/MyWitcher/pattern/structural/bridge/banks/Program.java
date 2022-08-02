package org.example.MyWitcher.pattern.structural.bridge.banks;

import org.example.MyWitcher.pattern.structural.bridge.dev.Developer;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
