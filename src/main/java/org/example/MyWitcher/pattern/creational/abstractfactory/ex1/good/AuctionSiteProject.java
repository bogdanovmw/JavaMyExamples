package org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good;

import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.factory.ProjectTeamFactory;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.factory.WebsiteTeamFactory;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Developer;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.ProjectManager;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Tester;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.geDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating site ...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
