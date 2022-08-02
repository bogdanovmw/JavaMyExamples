package org.example.MyWitcher.java.multithreading;

import java.util.ArrayList;

public class WaitNotify {
    public static void main(String[] args) {
        BlockQueue queue = new BlockQueue();

        Thread worker = new Thread(() -> {
            while (true){
                Runnable task = queue.get();
                task.run();
            }
        });
        worker.start();

        for (int i = 0; i < 5; i++) {
            queue.put(getTask());
        }
    }

    public static Runnable getTask(){
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Task started: " + this);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task finished: " + this);
            }
        };
    }

    static class BlockQueue {
        ArrayList<Runnable> tasks = new ArrayList<>();

        public synchronized Runnable get() {
            while (tasks.isEmpty()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
