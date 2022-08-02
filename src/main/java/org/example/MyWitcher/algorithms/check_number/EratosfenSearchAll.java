package org.example.MyWitcher.algorithms.check_number;

//Решето Эратосфена. Проверка числа на простоту.
// Числа: простые(делиться только на себя и на 1) и составные(Делиться на что-то еще кроме себя и 1)
public class EratosfenSearchAll {
    public static void main(String[] args) {
        RandomGenerator goodGenerator = new RandomGenerator(317, 51, 128, 1);
        for (int i = 0; i < 100; i++) {
            System.out.println(goodGenerator.get());
        }
    }

    // Генератор простых чисел
    public static class RandomGenerator {
        private final int a;
        private final int c;
        private final int m;
        private int xLast;

        public RandomGenerator(int a, int c, int m, int xLast) {
            this.a = a;
            this.c = c;
            this.m = m;
            this.xLast = xLast;
        }

        int get(){
            xLast = (a * xLast + c) % m;
            return Math.abs(xLast);
        }
    }
}
