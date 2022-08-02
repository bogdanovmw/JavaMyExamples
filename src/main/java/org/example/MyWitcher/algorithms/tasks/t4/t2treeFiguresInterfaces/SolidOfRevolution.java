package org.example.MyWitcher.algorithms.tasks.t4.t2treeFiguresInterfaces;

public abstract class SolidOfRevolution implements Shape {
    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
