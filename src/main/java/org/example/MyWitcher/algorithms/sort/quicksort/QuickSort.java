package org.example.MyWitcher.algorithms.sort.quicksort;


import java.util.Arrays;

// O(nlog(n))
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[] { 11, 22, 55, 33, 44};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] arr, int from, int to){
        if (from < to){
            // Выбирается опорный элемент, все элементы которые меньше него перемещаются в левую часть, а все элементы которые больше в правую
            int divideIndex = partition(arr, from, to);
            printSortStep(arr, from, to, divideIndex);
            quickSort(arr, from, divideIndex -1);
            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to){
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex){
            while (arr[leftIndex] < pivot){
                leftIndex++;
            }
            while (arr[rightIndex] > pivot){
                rightIndex--;
            }

            if (leftIndex <= rightIndex){
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2){
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.println(Arrays.toString(arr));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + Arrays.toString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", right: " + Arrays.toString(Arrays.copyOfRange(arr, partitionIndex, to + 1)) + "\n");
    }

}
