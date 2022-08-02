package org.example.MyWitcher.algorithms.tasks.t7;


import java.util.*;

/**
 * Напишите метод, который получает на вход Map<K, V> и возвращает Map,
 * где ключи и значения поменяны местами. Так как значения могут совпадать, то тип значения в Map будет уже не K, а Collection<K>
 * */
public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>() {{
            put(1, "One");
            put(2, "Two");
            put(3, "Three");
            put(4, "Four");
            put(5, "Five");
        }};

        inverse(hashMap).forEach((s, integers) -> {
            System.out.println(s + " " + integers);
        });
    }

    public static <K, V> Map<V, Collection<K>> inverse(Map<? extends K, ? extends V> map) {
        Map<V, Collection<K>> resultMap = new HashMap<>();

        Set<? extends K> keys = map.keySet();
        for(K key : keys) {
            V value = map.get(key);
            resultMap.compute(value, (v, ks) -> {
                if (ks == null)
                    ks = new HashSet<>();
                ks.add(key);
                return ks;
            });
        }


        return resultMap;
    }
}
