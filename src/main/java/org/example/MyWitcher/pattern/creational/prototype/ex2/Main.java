package org.example.MyWitcher.pattern.creational.prototype.ex2;

import org.example.MyWitcher.pattern.creational.prototype.ex2.shapes.Circle;
import org.example.MyWitcher.pattern.creational.prototype.ex2.shapes.Rectangle;
import org.example.MyWitcher.pattern.creational.prototype.ex2.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Формы — это разные объекты");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": И они идентичны");
                } else {
                    System.out.println(i + ": Но они не идентичны");
                }
            } else {
                System.out.println(i + ": Объекты формы одинаковые");
            }
        }
    }
}
