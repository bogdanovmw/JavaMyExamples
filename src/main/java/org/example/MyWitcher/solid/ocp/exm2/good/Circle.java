package org.example.MyWitcher.solid.ocp.exm2.good;

public class Circle extends Shape {
    private double radios;

    public Circle(double radios) {
        this.radios = radios;
    }

    public double getRadios() {
        return radios;
    }

    public void setRadios(double radios) {
        this.radios = radios;
    }

    @Override
    public double area() {
        return Math.pow(this.radios, 2) * Math.PI;
    }
}
