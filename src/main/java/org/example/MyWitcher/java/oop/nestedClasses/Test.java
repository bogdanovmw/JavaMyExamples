package org.example.MyWitcher.java.oop.nestedClasses;

public class Test {
    static int i = 0;
    int j = 0;

    public static void out() {
        System.out.println("Test");
    }

    public void in() {
        System.out.println("Test");
    }

    class A {
        public void get() {
            System.out.println(Test.i);
            Test.out();

            Test test = new Test();
            System.out.println(test.j);
            test.in();
        }
    }

    static class B {
        public static void get() {
            System.out.println(Test.i);
            Test.out();

            Test test = new Test();
            System.out.println(test.j);
            test.in();
        }

        public void set() {
            System.out.println("Set");
        }
    }
}


