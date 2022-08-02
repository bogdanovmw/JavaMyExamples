package org.example.MyWitcher.java.multithreading;

public class Subsequence {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Test t = new Test(i);
            t.start();
            t.join();
        }
    }
}

class Test extends Thread {
    private int num;

    public Test(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Thread = " + num);
    }
}