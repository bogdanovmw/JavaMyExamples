package org.example.MyWitcher.java.core.lambda;

public class Ex1 {
    @FunctionalInterface
    interface Function<T1, T2, R> {
        R apply(T1 arg1, T2 arg2);
    }

    public static void main(String[] args) {
        Function<Integer, Integer, Integer> function = (arg1, arg2) -> arg1 + arg2;
        System.out.println(function.apply(3, 6));
    }
}
