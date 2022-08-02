package org.example.MyWitcher.algorithms.tasks.t7;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
 * Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
 * Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
 * */
public class Task2 {
    public static void main(String[] args) {
        final int N = 1000000;

        List<Integer> arrayList = (List<Integer>) generate(new ArrayList<>(), N);
        List<Integer> linkedList = (List<Integer>) generate(new LinkedList<>(), N);

        print(arrayList, linkedList, N);
    }
    
    public static Collection<Integer> generate(Collection<Integer> t, int N) {
        for (int i = 0; i <= N; i++) {
            t.add(ThreadLocalRandom.current().nextInt(0, 100));
        }
        return t;
    }

    public static void print(List<Integer> arrayList, List<Integer> linkedList, int N) {
        final int M = 1000;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
