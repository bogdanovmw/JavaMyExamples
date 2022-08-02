package org.example.MyWitcher.algorithms.tasks.t6;

import java.util.Arrays;

/**
 * Напишите метод filter, который принимает на вход массив (любого типа) и реализацию интерфейса Filter c методом apply(Object o),
 * чтобы убрать из массива лишнее.
 * Проверьте как он работает на строках или других объектах.
 * */
public class Filter {
    public static Object[] filter(Object[] array, IFilter filter) {
        int offset = 0;

        for (int i = 0; i < array.length; i++) {
            if (!filter.apply(array[i])) {
                offset ++;
            } else {
                array[i - offset] = array[i];
            }
        }

        // Arrays.copyOf копирует значение из массива array в новый массив
        // с длинной array.length - offset
        return Arrays.copyOf(array, array.length - offset);
    }

    public static void main(String[] args) {
        String[] array = new String[]{"1rewf ", "feefewf", "a", null, "1"};

        String[] newArray =  (String[]) filter(array, new IFilter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        });

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
    }
}

interface IFilter {
    boolean apply(Object o);
}
