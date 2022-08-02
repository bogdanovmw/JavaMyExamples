package org.example.MyWitcher.pattern.creational.builder.ex1.good;

import org.example.MyWitcher.pattern.creational.builder.ex1.good.model.Website;

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite(){
        website = new Website();
    }

    abstract void buildName();
    abstract void builtCms();
    abstract void builtPrice();

    Website getWebsite(){
        return website;
    }
}
