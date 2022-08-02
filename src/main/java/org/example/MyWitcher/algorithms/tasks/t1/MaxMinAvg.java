package org.example.MyWitcher.algorithms.tasks.t1;

import java.util.Arrays;

/**
 * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 * */
public class MaxMinAvg {
    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (double v : array) {
            if (max < v)
                max = v;
            if (min > v)
                min = v;

            avg += v / array.length;
        }

        Arrays.stream(array).forEach(System.out::println);
        System.out.println("\nmin = " + min);
        System.out.println("max = " + max);
        System.out.println("avg = " + avg);
    }
}
