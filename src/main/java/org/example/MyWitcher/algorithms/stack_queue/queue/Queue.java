package org.example.MyWitcher.algorithms.stack_queue.queue;

/**
 * Очередь
 * Первый пришел - первый ушел
 * First in - First out
 * FIFO
 * */
public interface Queue<T> {
    void add(T item);
    T remove();

    boolean isEmpty();
}
