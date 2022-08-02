package org.example.MyWitcher.algorithms.tasks.t1;

import java.util.Arrays;

/**
 * Реализуйте алгоритм сортировки пузырьком для сортировки массива
 * */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 9, 11, 74, 2, 41, 66, 7, 3, 91, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        Arrays.stream(arr).forEach(System.out::println);

    }
}
