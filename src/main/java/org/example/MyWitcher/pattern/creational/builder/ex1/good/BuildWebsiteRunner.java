package org.example.MyWitcher.pattern.creational.builder.ex1.good;


import org.example.MyWitcher.pattern.creational.builder.ex1.good.model.Website;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
//        director.setBuilder(new VisitCardWebSiteBuilder());
        director.setBuilder(new EnterpriseWebSiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
