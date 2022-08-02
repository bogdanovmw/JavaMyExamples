package org.example.MyWitcher.java.core.reflection.ex2;

import java.util.Arrays;

public class CodeAnalyzer {
    public static void analyzeClass(Object o) {
        Class<?> clazz = o.getClass();
        System.out.println("Имя класса: " + clazz);
        System.out.println("Поля класса: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Родительский класс: " + clazz.getSuperclass());
        System.out.println("Методы класса: " +  Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(clazz.getConstructors()));
    }

    public static void main(String[] args) {
        analyzeClass(new Cat("Кроша ху*ша", 11));
    }
}
