package org.example.MyWitcher.algorithms.sort;

import java.util.Arrays;

// Сортировка выбором :: Selection sort
public class SelectionSort {
    // Ищется минимальное значение, потом ставиться на первое место в массиве, потом ищется опять минимальное значение, но уже без учета первого элемента
    // Выбор - Обмен
    public static void main(String[] args) {
        int[] array = new int[] { 88, 12, 42, 555, 41, 31, 53, 1, 154, 24, 57, 42, 74, 55, 73, 5};

        for (int step = 0; step < array.length; step++){
            System.out.println(Arrays.toString(array));
            int index = getMin(array, step);

            int tpm = array[step];
            array[step] = array[index];
            array[index] = tpm;
        }
    }

    public static int getMin(int[] array, int start){
        int min = array[start];
        int index = start;

        for(int i = start; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
