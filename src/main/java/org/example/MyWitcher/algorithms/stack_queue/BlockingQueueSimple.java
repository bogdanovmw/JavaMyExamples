package org.example.MyWitcher.algorithms.stack_queue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueSimple {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        Thread producer = new Thread(() -> {
            String[] words = new String[] {"123", "abc", "qwerty", "queue", "stack", "array", "list"};
            for (int i = 0; i < words.length && !Thread.interrupted();) {
                try {
                    Thread.sleep(3000);
                    queue.put(words[i]);
                    System.out.println("producer: записал в очередь " + words[i] + ", число элементов в очереди: " + queue.size());
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(5000);
                    System.out.println("consumer: обработал из очереди " + queue.take() + ", число элементов в очереди: " + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.start();
    }
}
