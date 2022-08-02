package org.example.MyWitcher.algorithms.quealsVarsAndClass;

import lombok.Getter;

public class Main {
    public static void main(String[] args) {
        String s1 = "Test";
        String s2 = "Test";
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true

        String s3 = new String("Test");
        String s4 = new String("Test");
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true

        A a1 = new A();
        A a2 = new A();
        System.out.println(a1 == a2); // false
        System.out.println(a1.s == a2.s); // true
        System.out.println(a1.s.equals(a2.s)); // true

        B b1 = new B();
        B b2 = new B();
        System.out.println(b1 == b2); // false
        System.out.println(b1.getS() == b2.getS()); // false
        System.out.println(b1.getS().equals(b2.getS())); // true
    }
}

final class A {
    public static String s = "aTest";
}

@Getter
final class B {
    private String s = "aTest";
}
