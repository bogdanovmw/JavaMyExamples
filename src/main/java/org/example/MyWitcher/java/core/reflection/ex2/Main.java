package org.example.MyWitcher.java.core.reflection.ex2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    // Создание экземпляра класса без параметров
    public static Cat createCat() throws Exception {
        Class<?> clazz = Class.forName("org.example.MyWitcher.java.core.reflection.ex2.Cat");
        return (Cat) clazz.newInstance();
    }
    public static Object createObject() throws Exception {
        Class<?> clazz = Class.forName("org.example.MyWitcher.java.core.reflection.ex2.Cat");
        return clazz.newInstance();
    }
    // End

    // Создание экземпляра класса с параметрами
    public static Cat createCatWithParam() throws Exception {
        Class<?> clazz = Class.forName("org.example.MyWitcher.java.core.reflection.ex2.Cat");
        Class<?>[] catClassParams = { String.class, int.class };
        return (Cat) clazz.getConstructor(catClassParams).newInstance("Barsik", 6);
    }
    // End

    // Получить или установить данные private поля, если нет getter и setters
    public static Cat createCatWithoutSetters() throws Exception {
        Class<?> clazz = Class.forName("org.example.MyWitcher.java.core.reflection.ex2.Cat");
        Cat cat = (Cat) clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(cat, "Ivan4ik");
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(cat, 2);

        return cat;
    }
    // End

    // Выполнить метод если он private
    public static void invokeSayMeowMethod() throws Exception {
        Class<?> clazz = Class.forName(Cat.class.getName());
        Cat cat = new Cat("Max", 27);
        Method sayMeow = clazz.getDeclaredMethod("sayMeow");
        sayMeow.setAccessible(true);
        sayMeow.invoke(cat);
    }
    // End

    public static void main(String[] args) throws Exception {
//        System.out.println(createCat());
//        System.out.println(createObject());
//        System.out.println(createCatWithParam());
//        System.out.println(createCatWithoutSetters());
        invokeSayMeowMethod();
    }
}
