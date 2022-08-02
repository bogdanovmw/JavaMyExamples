package org.example.MyWitcher.algorithms.search;

import java.util.HashSet;
import java.util.Set;

// Задача состоит в поиске двух чисел из отсортированного массива, в сумме дающих заданное число.
// [-1,2,5,8],      k = 7,      res = [2,5]
// [-3,-1,0,2,6],   k = 6,      res = [0,6]
// [2,4,5],         k = 8,      res = []
// [-2,-1,1,2],     k = 0,      res = [-2,2]
public class SearchNumberInArrayBySum {
    public static void main(String[] args) {

    }

    // Решение с помощью перебора всех пар чисел
    // Время работы O(n^2)
    // Память O(1)
    int[] twoSum(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[0];
    }

    // Решение с помощью HashSet
    // Время работы O(n)
    // Память O(n)
    int[] twoSum2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int numberToFind = k - nums[i];
            if (set.contains(numberToFind)) {
                return new int[]{numberToFind, nums[i]};
            }
            set.add(nums[i]);
        }

        return new int[0];
    }

    // Решение с помощью бинарного поиска (Главное, что бы массив был отсортирован)
    // Время работы O(n log n)
    // Память O(1)
    int[] twoSum3(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = k - nums[i];
            int l = i + 1, r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] == numberToFind) {
                    return new int[]{nums[i], nums[mid]};
                }
                if (numberToFind < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return new int[0];
    }

    // Решение с помощью двух указателей
    // Время работы O(n)
    // Память O(1)
    int[] twoSum4(int[] nums, int k) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == k) {
                return new int[]{nums[l], nums[r]};
            }
            if (sum < k) {
                l++;
            } else {
                r--;
            }
        }

        return new int[0];
    }
}
