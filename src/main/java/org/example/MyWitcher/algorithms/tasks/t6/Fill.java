package org.example.MyWitcher.algorithms.tasks.t6;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Задача, немного похожая на предыдущую:
 * Напишите метод fill, который принимает массив объектов, и реализацию интерфейса Function (или своего).
 * Метод fill должен заполнить массив, получая новое значение по индексу с помощью реализации интерфейса Function.
 * То есть, использовать его хочется так
 * */
public class Fill {
    public static void main(String[] args) {
        Integer[] squares = new Integer[100];
        fill(squares, integer -> integer * integer);
        System.out.println(Arrays.toString(squares));
    }

    public static <T> void fill(T[] objects, Function<Integer, ? extends T> function) {
        for(int i = 0; i < objects.length; i++){
            objects[i] = function.apply(i);
        }
    }
}
