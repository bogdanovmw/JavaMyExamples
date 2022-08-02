package org.example.MyWitcher.algorithms.tasks.t1;

import java.util.Arrays;

/**
 * Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
 * */
public class DeleteNumberFromArray {
    public static void main(String[] args) {
        int testArray[] = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(Arrays.toString(removeElement(testArray, 3)));
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }

        return Arrays.copyOf(nums, nums.length - offset);
    }
}
