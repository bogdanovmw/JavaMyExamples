package org.example.MyWitcher.java.core.date;

public class Millis {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();// wall-clock time она зависит от времени заданной в ОС
        System.out.println("Число миллисекунд прошедших с 00:00:00 UTC 1 января 1970 года: " + time);
        long nanoTime = System.nanoTime(); // just timer
        System.out.println("Число наносекунд прошедших с какого-то момента X: " + nanoTime);

        System.out.println(measureTime(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
    }

    public static long measureTime(Runnable codeToMeasure){
        long startTime = System.nanoTime();
        codeToMeasure.run();
        return System.nanoTime() - startTime;
    }
}
