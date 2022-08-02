package org.example.MyWitcher.java.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericClass {
    public static void main(String[] args) {
        SomeType<String> st = new SomeType<>();
//        SomeType st = new SomeType<>(); - а если сотрем
        List<String> list = Arrays.asList("test", "one", "dog");
        st.test(list);
    }

    static class SomeType<T> {
        public <E> void test(Collection<E> collection) {
            for (E el : collection) {
                System.out.println(el);
            }
        }

        public void test(List<Integer> collection) {
            for (Integer el : collection) {
                System.out.println(el);
            }
        }
    }
}

