package org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.factory;

import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.banking.BankingPM;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.banking.JavaDeveloper;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.banking.QATester;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Developer;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.ProjectManager;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Tester;

public class BankingTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer geDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
