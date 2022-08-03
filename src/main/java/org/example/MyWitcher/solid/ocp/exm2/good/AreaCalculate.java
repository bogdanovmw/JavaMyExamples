package org.example.MyWitcher.solid.ocp.exm2.good;

public class AreaCalculate {
    public double areaCalc(Shape... shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea = shape.area();
        }
        return totalArea;
    }
}
