package org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.banking;


import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper");
    }
}
