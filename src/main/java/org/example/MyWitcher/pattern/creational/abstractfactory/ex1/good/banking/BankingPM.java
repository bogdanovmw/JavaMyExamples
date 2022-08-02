package org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.banking;

import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM");
    }
}
