package org.example.MyWitcher.algorithms.tasks.t7;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
 * где K — значение из массива, а Integer — количество вхождений в массив.
 * */
public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Integer> integerIntegerMap = countValues(new Integer[]{1, 2, 3, 4, 5, 6});
        System.out.println(integerIntegerMap);
    }

    public static <K> Map<K, Integer> countValues(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : ks) {
            map.compute(k, new BiFunction<K, Integer, Integer>() {
                @Override
                public Integer apply(K k, Integer count) {
                    return count == null ? 1 : count + 1;
                }
            });
        }
        return map;
    }
}
