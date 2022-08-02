package org.example.MyWitcher.pattern.creational.builder.ex2.components;

public class GPSNavigation {
    private String route;

    public GPSNavigation() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigation(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
