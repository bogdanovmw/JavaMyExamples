package org.example.MyWitcher.algorithms.tasks.t7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 * */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(2);
        removeDuplicates(list).forEach(System.out::println);
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
