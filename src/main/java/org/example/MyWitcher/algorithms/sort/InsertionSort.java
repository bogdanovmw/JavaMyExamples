package org.example.MyWitcher.algorithms.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Берем каждый неотсортированный элемент n и сравниваем его со значениями в отсортированном подмассиве справа налево,
 * пока не определим подходящую позицию для n (то есть, в тот момент, когда находим первое число, которое меньше, чем n).
 * Затем сдвигаем все отсортированные элементы, которые находятся справа от этого числа вправо, чтобы образовалось место для нашего n,
 * и вставляем его туда, тем самым расширяя отсортированную часть массива.
 *
 * Для каждого неотсортированного элемента n нужно:
 *      Определить место в отсортированной части массива, куда нужно вставить n
 *      Сдвинуть отсортированные элементы вправо, чтобы сделать лакуну для n
 *      Вставить n в образовавшуюся лакуну в отсортированной части массива
 * */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[] { 88, 12, 42, 555, 41, 31, 53, 1, 154, 24, 57, 42, 74, 55, 73, 5};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }

    private static void sortNaive(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int min = current;
            int minIndex = i;

            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }

            list.set(i, min);
            list.set(minIndex, current);
        }
    }
}
