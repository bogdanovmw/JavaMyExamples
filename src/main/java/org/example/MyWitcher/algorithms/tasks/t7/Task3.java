package org.example.MyWitcher.algorithms.tasks.t7;

import org.example.MyWitcher.pattern.behavioral.iterator.Iterator;

import java.util.NoSuchElementException;

/**
 * Написать итератор по массиву
 * */
public class Task3 {
    public static void main(String[] args) {
        ArrayIterator<Integer> array = new ArrayIterator<>(new Integer[] {1, 2, 3, 4, 5, 6});

        while (array.hasNext()){
            System.out.println(array.next());
        }
    }

    static class ArrayIterator<T> implements Iterator {
        private final T[] array;
        private int index = 0;

        public ArrayIterator(T[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Object next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return array[index++];
        }
    }
}
