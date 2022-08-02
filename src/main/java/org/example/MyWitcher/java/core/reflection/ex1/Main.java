package org.example.MyWitcher.java.core.reflection.ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Получить name, когда нету getter
//        MyClass myClass = new MyClass();
//        int number = myClass.getNumber();
//        String name = null; // not getter
//        System.out.println(number + " " + name);
//        printData(myClass);

//        Field field = myClass.getClass().getDeclaredField("name");
//        field.setAccessible(true);
//        field.set(myClass, "new value");
//        name = (String) field.get(myClass);

//        System.out.println(number + " " + name);
//        printData(myClass);
        // end

        // Вернуть все поля
//        Field[] fields = myClass.getClass().getDeclaredFields();
//        Arrays.stream(fields).forEach(System.out::println);
//        System.out.println("");
//        Method[] methods = myClass.getClass().getDeclaredMethods();
//        Arrays.stream(methods).forEach(System.out::println);

//        System.out.println(MyClass.class.getName()); - имя класса

        // Создание экземпляра при помощи рефлексии
//        MyClass myAClass = null;
//        Class<?> aClass = Class.forName(MyClass.class.getName()); // нужно заставить ClassLoader загрузить его и получить описание нашего класса в виде переменной типа Class
//        myAClass = (MyClass) aClass.newInstance();

        // Если конструктор с параметрами
//        Class[] params = {int.class, String.class};
//        myAClass = (MyClass) aClass.getConstructor(params).newInstance(1, "default2");
//        System.out.println(myAClass);

        // Получить значение поля name
//        Field name = myAClass.getClass().getDeclaredField("name");
//        name.setAccessible(true);
//        System.out.println((String) name.get(myAClass));
        // end

        // узнать какие параметры у конструктора
//        Constructor<?>[] constructors = aClass.getConstructors();
//        for (Constructor constructor : constructors) {
//            Class[] parameterTypes = constructor.getParameterTypes();
//            for (Class paramType : parameterTypes) {
//                System.out.println(paramType.getName());
//            }
//        }

        // Передать выполнить метод с параметром
//        Class<?> cl = MyClass.class;
//        MyClass aClass1 = new MyClass();
//        Class<?>[] paramTypes = new Class<?> [] {String.class};
//        Method method = cl.getDeclaredMethod("print", paramTypes);
//        method.setAccessible(true);
//        method.invoke(aClass1, "Test");
    }

    public static void printData(Object myClass) throws Exception {
        Method method = myClass.getClass().getDeclaredMethod("printData");
        method.setAccessible(true);
        method.invoke(myClass); // Выполнить метод
    }
}
