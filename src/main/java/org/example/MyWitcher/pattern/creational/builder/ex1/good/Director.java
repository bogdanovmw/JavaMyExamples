package org.example.MyWitcher.pattern.creational.builder.ex1.good;

import org.example.MyWitcher.pattern.creational.builder.ex1.good.model.Website;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.builtCms();
        builder.builtPrice();

        return builder.getWebsite();
    }
}
