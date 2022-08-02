package org.example.MyWitcher.java.core.type_erasure;

import java.awt.*;
import java.util.ArrayList;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        String str = "Hello world";
        list.add(str);
        list.add(5);
//        str = (String) list.get(1);


        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        if (stringList.getClass() == intList.getClass()) {

        }

        AddTenList<Rectangle> addTenList = new AddTenList<>(Rectangle::new);
    }

//    class TestClass<T> {
    class TestClass<T extends Comparable<T>> {
        private void handle(T operand){

        }
        private void handle(Object obj){

        }
    }

    public static class AddTenList<T> {
        private ArrayList<T> list = new ArrayList<>();
        private AddTenList(Supplier<T> factory) {
            for (int i = 0; i < 10; i++) {
                list.add(factory.get());
            }
        }
        public ArrayList<T> getList () {
            return list;
        }
    }
}
