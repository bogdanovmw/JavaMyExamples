package org.example.MyWitcher.algorithms.search;

import org.example.MyWitcher.algorithms.sort.BubbleSort;


public class SearchLinearBinaryInArray {
    public static void main(String[] args) {
        int[] array = new int[] { 15, 78, 89, 9, 12, 12546, 8, 879, 16, 54, 1};
        System.out.println(searchLinear(array, 12546));

        BubbleSort.bubbleSort(array); // [1, 8, 9, 12, 15, 16, 54, 78, 89, 879, 12546]
        System.out.println(searchBinary(array, 879));
        System.out.println(searchBinaryRecursive(array, 0, array.length -1,16));
    }

    // Линейный поиск
    // Сложность O(n)
    public static int searchLinear(int[] array, int elementToFind){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind){
                return i;
            }
        }
        return -1;
    }

    // Бинарный или Двоичный поиск (Главное, что бы массив был отсортирован)
    public static int searchBinaryRecursive(int array[], int startIndex, int endIndex, int elementToFind){
        if (endIndex >= startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2; // Середина Массива

            if (array[middleIndex] == elementToFind){
                return middleIndex;
            }

            if (array[middleIndex] > elementToFind) {
                return searchBinaryRecursive(array, startIndex, middleIndex -1, elementToFind);
            } else {
                return searchBinaryRecursive(array, middleIndex + 1, endIndex, elementToFind);
            }
        }
        return -1;
    }

    public static int searchBinary(int [] array, int elementToFind){
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        while (startIndex <= endIndex){
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == elementToFind){
                return middleIndex;
            }

            if (array[middleIndex] > elementToFind) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        return -1;
    }
}
