package org.example.MyWitcher.algorithms.examples.myArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.getAll().forEach(System.out::println);

        System.out.println("Count element: " + list.size());
        System.out.println("Get element by index: " + list.get(3));

        list.remove(0);
        list.remove(2);

        list.getAll().forEach(System.out::println);

        list.
    }
}
