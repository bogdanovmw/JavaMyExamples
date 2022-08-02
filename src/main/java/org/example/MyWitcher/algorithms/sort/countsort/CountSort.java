package org.example.MyWitcher.algorithms.sort.countsort;

import java.util.Arrays;

public class CountSort  {
    public static void main(String[] args) {
        int[] array = new int[] { 88, 12, 42, 55, 41, 31, 53, 1, 74, 24, 57, 42, 74, 55, 73, 5};
        countSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void countSort(int[] array){
        final int MAX_VALUE = 100;
        int[] count = new int[MAX_VALUE];

        for (int k : array) {
            count[k]++;
        }

        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayIndex] = i;
                arrayIndex++;
            }
        }
    }
}
