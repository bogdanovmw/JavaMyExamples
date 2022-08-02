package org.example.MyWitcher.java.generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    public static class Util {
        public static <T> T getValue(Object obj, Class<T> clazz) {
            return (T) obj;
        }
        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList("Author", "Book");
        for (Object element : list) {
            String data = Util.getValue(element, String.class);
            System.out.println(data);
            System.out.println(Util.<String>getValue(element));
//            System.out.println(Util.<Integer>getValue(element, String.class)); - ошибка
        }
    }
}
