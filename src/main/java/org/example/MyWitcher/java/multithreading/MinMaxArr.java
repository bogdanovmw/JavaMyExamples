package org.example.MyWitcher.java.multithreading;

import java.util.Scanner;

public class MinMaxArr {
    public static void main(String[] args) throws InterruptedException {
        int arrays [] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();

        }

        MyThread min = new MyThread(arrays);
        MyThread max = new MyThread(arrays);
        min.start();
        max.start();
        min.join();
        max.join();
        System.out.println(min.getMin());
        System.out.println(max.getMax());
    }
}

class MyThread extends Thread {
    private int [] arr;
    private int min;
    private int max;

    public MyThread(int[] arr) {
        this.arr = arr;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void run() {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                this.min = arr[i];
            }
            if (arr[i] > max) {
                this.max = arr[i];
            }
        }
    }
}
