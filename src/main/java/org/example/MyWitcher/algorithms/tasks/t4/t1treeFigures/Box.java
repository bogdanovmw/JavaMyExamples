package org.example.MyWitcher.algorithms.tasks.t4.t1treeFigures;

import java.util.ArrayList;
import java.util.List;

public class Box extends Shape {
    private List<Shape> shapes = new ArrayList<>();
    private double available;

    public Box(double available) {
        super(available);
        this.available = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
