package org.example.MyWitcher.algorithms.search;

public class SearchMinMaxInArray {
    public static void main(String[] args) {
        int[] array = new int[] { 88, 12, 42, 555, 41, 31, 53, 1, 154, 24, 57, 42, 74, 55, 73, 5};


        System.out.println("min value: " + getMin(array)[0] + ", index: " + getMin(array)[1]);
        System.out.println("max value: " + getMax(array)[0] + ", index: " + getMax(array)[1]);
    }

    public static int[] getMin(int[] array){
        int min = array[0];
        int index = 0;

        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return new int[] {min, index};
    }

    public static int[] getMax(int[] array){
        int max = array[0];
        int index = 0;

        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }
}
