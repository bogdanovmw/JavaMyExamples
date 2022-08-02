package org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.factory;

import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.ProjectManager;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Tester;
import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.Developer;

public interface ProjectTeamFactory {
    Developer geDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
