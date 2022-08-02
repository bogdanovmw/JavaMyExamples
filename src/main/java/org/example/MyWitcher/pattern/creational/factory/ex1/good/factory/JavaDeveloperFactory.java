package org.example.MyWitcher.pattern.creational.factory.ex1.good.factory;

import org.example.MyWitcher.pattern.creational.factory.ex1.good.model.Developer;
import org.example.MyWitcher.pattern.creational.factory.ex1.good.model.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
