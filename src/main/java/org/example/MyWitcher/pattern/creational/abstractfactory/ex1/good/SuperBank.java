package org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good;

import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.factory.BankingTeamFactory;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.factory.ProjectTeamFactory;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Developer;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.ProjectManager;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Tester;

public class SuperBank {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.geDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Tester tester2 = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Bank system...");
        developer.writeCode();
        System.out.println(tester);
        System.out.println(tester2);
        projectManager.manageProject();
    }
}
