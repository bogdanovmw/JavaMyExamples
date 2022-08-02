package org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.website;


import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PhpDeveloper");
    }
}
