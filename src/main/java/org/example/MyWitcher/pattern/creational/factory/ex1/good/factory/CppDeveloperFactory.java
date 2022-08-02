package org.example.MyWitcher.pattern.creational.factory.ex1.good.factory;

import org.example.MyWitcher.pattern.creational.factory.ex1.good.model.CppDeveloper;
import org.example.MyWitcher.pattern.creational.factory.ex1.good.model.Developer;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
