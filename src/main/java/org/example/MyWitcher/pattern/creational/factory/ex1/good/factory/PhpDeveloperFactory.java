package org.example.MyWitcher.pattern.creational.factory.ex1.good.factory;

import org.example.MyWitcher.pattern.creational.factory.ex1.good.model.Developer;
import org.example.MyWitcher.pattern.creational.factory.ex1.good.model.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
