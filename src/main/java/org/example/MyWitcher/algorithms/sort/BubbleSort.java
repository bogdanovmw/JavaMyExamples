package org.example.MyWitcher.algorithms.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Сортировка Пузырьком
// Сравнение по парно (1 со 2, 2 с 3, 3 с 4), если левый элемент больше чем правый меняем местами
// O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[] { 64, 42, 73, 41 };
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
//            System.out.println(arrayToString(array));
        }
    }

    // Сортировка пузырьком сложных объектов через Comparator
    public static <T> int bubbleSortObject(List<T> list, Comparator<T> comparator){
        int count = 0;
        int k = 1;
        int j = list.size();
        while (k > 0){
            k = 0;
            for (int i = 1; i < j; i++) {
                if (comparator.compare(list.get(i - 1), list.get(i)) > 0) {
                    T tmp = list.get(i);
                    list.set(i, list.get(i));
                    list.set(i - 1, tmp);
                    k = i;
                }
                count++;
            }
            j = k;
        }
        return count;
    }
}
