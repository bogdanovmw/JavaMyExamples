package org.example.MyWitcher.java.generics;

import java.util.ArrayList;
import java.util.List;

public class RestrictionsGeneric {
    public static void main(String[] args) {
//        NumberContainer number1 = new NumberContainer(2L); - - ограничение только на Integer
//        NumberContainer number2 = new NumberContainer(1);
//        NumberContainer number3 = new NumberContainer("String"); - ограничение только на Integer


        List<String> list = new ArrayList<>();
        print(list);
    }

    private static class NumberContainer<T extends Integer> {
        private T number;

        public NumberContainer(T number) {
            this.number = number;
        }

        public void print() {
            System.out.println(number);
        }
    }

    // с extends работать нельзя он только читает
    // super записывает
    public static void print(List<? super String> list) {
        list.add("Hello World!");
        System.out.println(list.get(0));
    }
}
