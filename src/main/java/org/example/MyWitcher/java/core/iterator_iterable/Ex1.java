package org.example.MyWitcher.java.core.iterator_iterable;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36 };
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, array);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // Альтернатива iterator
        for (Integer integer : list) {
            System.out.println(integer);
        }

        // list.remove(0); - не за константное время происходит удаление
        // Что бы удалить за константное нужен iterator
        ListIterator<Integer> iterator2 = list.listIterator();
        while (iterator2.hasNext()){
            int item = iterator2.next();
            if (item >= 54) {
                iterator2.remove();
            }
        }
        list.forEach(System.out::println);
    }
}
