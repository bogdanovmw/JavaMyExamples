package org.example.MyWitcher.pattern.creational.singleton.ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Если вы видите одно и то же значение, значит синглтон был повторно использован" + "\n" +
                "Если вы видите разные значения, значит, было создано 2 синглтона" + "\n" +
                "Результат:" + "\n");

        /*
        * Топорно реализовать Одиночку очень просто — достаточно скрыть конструктор и предоставить статический создающий метод.
        * */
//        Singleton singleton = Singleton.getInstance("FOO");
//        Singleton anotherSingleton = Singleton.getInstance("BAR");
//        System.out.println(singleton.value);
//        System.out.println(anotherSingleton.value);

        /*
         * Что бы исправить проблему смотри в ex3
         * Тот же класс ведёт себя неправильно в многопоточной среде.
         * Несколько потоков могут одновременно вызвать метод получения Одиночки и создать сразу несколько экземпляров объекта.
         * */
//        Thread threadFoo = new Thread(new ThreadFoo());
//        Thread threadBar = new Thread(new ThreadBar());
//        threadFoo.start();
//        threadBar.start();
    }


    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton anotherSingleton = Singleton.getInstance("BAR");
            System.out.println(anotherSingleton.value);
        }
    }
}
