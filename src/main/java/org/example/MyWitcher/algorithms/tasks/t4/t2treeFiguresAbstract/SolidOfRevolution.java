package org.example.MyWitcher.algorithms.tasks.t4.t2treeFiguresAbstract;

public abstract class SolidOfRevolution extends Shape{
    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
