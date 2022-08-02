package org.example.MyWitcher.algorithms.search;

public class SearchTwoMinElInArray {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 1, 1, 1, 1};
//        int[] array = new int[] { 15, 78, 89, 15, 12, 12546, 8, 879, 16, 54, 18};

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min2 = min;
                min = array[i];
            } else if (array[i] < min2 && array[i] != min){
                min2 = array[i];
            }
        }
        System.out.println("Минимальный элемент в массиве: " + min);

        if (min2 != Integer.MAX_VALUE) {
            System.out.println("Второй минимальный элемент в массиве: " + min2);
        } else {
            System.out.println("Второго минимального элемента в массиве нут!");
        }
    }
}
