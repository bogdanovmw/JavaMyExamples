package org.example.MyWitcher.solid.ocp.exm2.bad;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Rectangle rectangle2 = new Rectangle(20, 37);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println(calculator.areaCalc(rectangle, rectangle2));
    }
}
