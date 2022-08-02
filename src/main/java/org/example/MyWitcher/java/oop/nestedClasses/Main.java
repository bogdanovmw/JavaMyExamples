package org.example.MyWitcher.java.oop.nestedClasses;

public class Main {
    public static void main(String[] args) {
        Test.A a = new Test().new A();
        a.get();

        Test.B.get();
        new Test.B().set();
    }
}
