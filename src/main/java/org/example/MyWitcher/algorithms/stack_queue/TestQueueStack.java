package org.example.MyWitcher.algorithms.stack_queue;

import org.example.MyWitcher.algorithms.stack_queue.queue.QueueImpl;
import org.example.MyWitcher.algorithms.stack_queue.stack.StackImpl;

public class TestQueueStack {
    public static void main(String[] args) {
//        testQueue();
        testStack();
    }

    private static void testQueue() {
        QueueImpl<Integer> queue = new QueueImpl<>();
        for (int i = 1; i < 10; i++) {
            System.out.println("add: " + i);
            queue.add(i);
        }
        System.out.println("\n");

        while (!queue.isEmpty()){
            System.out.println("remove: " + queue.remove());
        }
    }

    private static void testStack(){
        StackImpl<Integer> stack = new StackImpl<>();
        for (int i = 1; i < 10; i++) {
            System.out.println("add: " + i);
            stack.push(i);
        }
        System.out.println("\n");

        while (!stack.isEmpty()){
            System.out.println("remove: " + stack.pop());
        }
    }
}
