package org.example.MyWitcher.java.oop.extends_field_method;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.name + ", " + a.getName());
        A ab = new B();
        System.out.println(ab.name + ", " + ab.getName());
        B b = new B();
        System.out.println(b.name + ", " + b.getName());

        System.out.println(new A().pass);
        System.out.println(new A().getPass());
        System.out.println(new B().pass);
        System.out.println(new B().getPass());
    }
}

class A {
    String name = "var a";
    String getName() {
        return "method A";
    }
    static String pass = "static var  a";
    static String getPass() {
        return "static method A";
    }
}

class B extends A {
    String name = "var b";
    String getName() {
        return "method B";
    }
    static String pass = "static var b";
    static String getPass() {
        return "static method B";
    }
}
