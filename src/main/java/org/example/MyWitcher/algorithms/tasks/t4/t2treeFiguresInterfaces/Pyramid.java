package org.example.MyWitcher.algorithms.tasks.t4.t2treeFiguresInterfaces;

public class Pyramid implements Shape {
    private double height;
    private double s; // площадь основания

    public Pyramid(double height, double s) {
        this.height = height;
        this.s = s;
    }

    @Override
    public double getVolume() {
        return height * s * 4 / 3;
    }
}
