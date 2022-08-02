package org.example.MyWitcher.algorithms.stack_queue.queue;

import java.util.ArrayList;

public class QueueImpl<T> implements Queue<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T remove() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "QueueImpl{" +
                "list=" + list +
                '}';
    }
}
