package org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.factory;


import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Developer;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.ProjectManager;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Tester;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.website.PhpDeveloper;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.website.ManualTester;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.website.WebsitePM;

public class WebsiteTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer geDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
