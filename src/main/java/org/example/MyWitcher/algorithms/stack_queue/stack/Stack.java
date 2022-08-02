package org.example.MyWitcher.algorithms.stack_queue.stack;

/**
 * Стек (Стопка бумаг пример)
 * Первый пришел - первый вышел
 * Last in - First out
 * LIFO
 * */
public interface Stack<T> {
    void push(T item);
    T pop();

    boolean isEmpty();
}
