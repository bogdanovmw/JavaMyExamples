package org.example.MyWitcher.algorithms.tasks.t2.randomElementWithWeight;

import java.util.Arrays;

/**
    Решение основывается на геометрической идее:
    Будем считать, что веса — это длины некоторых отрезков.
    Тогда надо "уложить" все отрезки в один общий,
    генерировать случайное значение из этого общего отрезка,
    определять в какой из наших отрезков попало значение:
    |-|--|----------|
    0-1--3----------13
              ^
 */
public class Example1 {
    private int[] values; // значения
    private int[] weights; // веса
    private int[] ranges; // левые границы отрезков
    private int sum; // общая длина всех отрезков

    public Example1(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        ranges = new int[values.length];

        // Сумма длин всех отрезков
        sum = 0;
        for (int weight : weights)
            sum += weight;

        // Заполняем ranges, левыми границами
        int lastSum = 0;
        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = lastSum;
            lastSum += weights[i];
        }
    }

    /*
        Массив ranges уже заполнен, так что остаётся
        сгенерировать значение в промежутке [0;sum],
        и найти отрезок, содержащий это значение:
     */
    public int getRandom() {
        int random = (int) (Math.random() * (sum - 1));
        int index = Arrays.binarySearch(ranges, random);
        return values[index >= 0 ? index : -index - 2];
    }

    @Override
    public String toString() {
        return "Example1{" +
                "values=" + Arrays.toString(values) +
                ", weights=" + Arrays.toString(weights) +
                ", ranges=" + Arrays.toString(ranges) +
                ", sum=" + sum +
                '}';
    }

    public static void main(String[] args) {
        Example1 exm = new Example1(new int[]{1, 2, 3}, new int[]{1, 2, 10});
        System.out.println(exm);
        System.out.println(exm.getRandom());
    }
}
