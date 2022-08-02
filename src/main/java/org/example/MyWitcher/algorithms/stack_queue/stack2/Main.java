package org.example.MyWitcher.algorithms.stack_queue.stack2;

import java.util.Arrays;

public class Main {
    private int size;
    private int[] stackArray;
    private int top;

    public Main(int size) {
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }

    public void addElement(int el) {
        stackArray[++top] = el;
    }

    public int deleteElement() {
        return stackArray[top--];
    }

    public int readTop() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    @Override
    public String toString() {
        return "Main{" +
                "size=" + size +
                ", stackArray=" + Arrays.toString(stackArray) +
                ", top=" + top +
                '}';
    }

    public static void main(String[] args) {
        Main stack = new Main(10);
        stack.addElement(54);
        stack.addElement(32);
        stack.addElement(91);
        stack.addElement(15);

        stack.deleteElement();
        stack.deleteElement();

        while (!stack.isEmpty()) {
            int value = stack.deleteElement();
            System.out.println(value);
        }
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
