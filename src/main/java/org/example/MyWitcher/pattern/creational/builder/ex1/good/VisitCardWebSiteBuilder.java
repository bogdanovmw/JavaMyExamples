package org.example.MyWitcher.pattern.creational.builder.ex1.good;

import org.example.MyWitcher.pattern.creational.builder.ex1.good.model.Cms;

public class VisitCardWebSiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void builtCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void builtPrice() {
        website.setPrice(500);
    }
}
