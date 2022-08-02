package org.example.MyWitcher.solid.o.exm2.bad;

public class AreaCalculator {
//    public double areaCalc(Rectangle... rectangles) {
//        double area = 0;
//
//        for (Rectangle rectangle : rectangles) {
//            area += rectangle.getHeight() * rectangle.getWidth();
//        }
//
//        return area;
//    }

    public double areaCalc(Object... shapes) {
        double area = 0;

        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getHeight() * rectangle.getWidth();
            } else {
                Circle circle = (Circle) shape;
                area += Math.pow(circle.getRadios(), 2) * Math.PI;
            }
        }

        return area;
    }
}
