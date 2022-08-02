package org.example.MyWitcher.java.exceptions;

public class MyExceptions3 {
    public static void main(String[] args) {
        try {
            int result = Factorial.getFactorial(-5891);
            System.out.println(result);
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());
        }
    }
}

class Factorial {
    public static int getFactorial(int num) throws FactorialException {
        int result = 1;
        if (num < 1)
            throw new FactorialException("number " + num + " < 1", num);
        for (int i = 0; i < num; i++) {
            result *= i;
        }
        return result;
    }
}

class FactorialException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public FactorialException(String message, int number) {
        super(message);
        this.number = number;
    }
}