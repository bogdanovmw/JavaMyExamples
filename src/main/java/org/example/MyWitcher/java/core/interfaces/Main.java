package org.example.MyWitcher.java.core.interfaces;

public class Main {
    public static void main(String[] args) {
        MathApplication ap = new MathApplication();
        ap.setCalculatorService(new CalculatorServiceImpl());
        System.out.println(ap.add(1, 5));
        System.out.println(ap.del(19, 5));
        System.out.println(ap.divide(5, 5));
        System.out.println(ap.multiply(50, 5));
    }
}
