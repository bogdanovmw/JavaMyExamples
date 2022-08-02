package org.example.MyWitcher.java.multithreading;

import java.util.ArrayList;

public class Interrupted {
    public static void main(String[] args) {
        BlockQueue queue = new BlockQueue();

        Thread worker = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()){ // Флаг остановки
                Runnable task = null;
                try {
                    task = queue.get();
                    task.run();
                } catch (InterruptedException e) { // Надо обрабатывать, пропускать нельзя
                    Thread.currentThread().interrupt();
                }
            }
        });
        worker.start();

        for (int i = 0; i < 5; i++) {
            queue.put(getTask());
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.interrupt();
    }

    public static Runnable getTask(){
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Task started: " + this);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task finished: " + this);
            }
        };
    }

    static class BlockQueue {
        ArrayList<Runnable> tasks = new ArrayList<>();

        public synchronized Runnable get() throws InterruptedException {
            while (tasks.isEmpty()){
                wait();
            }
            Runnable task = tasks.get(0);
            tasks.remove(task);
            return task;
        }

        public synchronized void put(Runnable task) {
            tasks.add(task);
            notify();
        }
    }
}
