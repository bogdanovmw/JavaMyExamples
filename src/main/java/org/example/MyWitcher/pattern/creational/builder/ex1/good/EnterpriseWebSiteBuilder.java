package org.example.MyWitcher.pattern.creational.builder.ex1.good;

import org.example.MyWitcher.pattern.creational.builder.ex1.good.model.Cms;

public class EnterpriseWebSiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void builtCms() {
        website.setCms(Cms.ALFRESCO);
    }

    @Override
    void builtPrice() {
        website.setPrice(10000);
    }
}
