package org.example.MyWitcher.java.exceptions;

public class MyExceptions {
    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions();

        try {
            exceptions.method1();
        } catch (OneException e) {
            System.out.println("Exceptions = method1");
            e.printStackTrace();
        }

        exceptions.method2();
    }
}

class Exceptions {
    public void method1 () throws OneException {
        throw new OneException();
    }

    public void method2 () {
        try {
            throw new TwoException();
        } catch (TwoException e) {
            System.out.println("Exceptions = method2");
            e.printStackTrace();
        }
    }
}

class OneException extends Exception {

}

class TwoException extends Exception {

}