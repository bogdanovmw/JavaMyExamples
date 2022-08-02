package org.example.MyWitcher.algorithms.tasks.t4.t2treeFiguresInterfaces;

public interface Shape extends Comparable<Shape> {
    double getVolume();

    @Override
    default int compareTo(Shape o) {
        return Double.compare(getVolume(), o.getVolume());
    }
}
