package org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.website;

import org.example.MyWitcher.pattern.creational.abstractfactory.ex1.good.model.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM");
    }
}
