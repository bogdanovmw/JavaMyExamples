package org.example.MyWitcher.java.core;

public class Utils {
    public static void main(String[] args) {
        measureTime(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    // Посмотреть затраченное время выполнения методов
    public static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }
}
