package org.example.MyWitcher.algorithms.tasks.t2.randomElementWithWeight;

import java.util.Arrays;

/**
 * Есть ещё один вариант решения этой задачи. Можно создать массив, размер которого равен сумме всех весов.
 * Тогда выбор случайного элемента сводится к генерации случайного индекса.
 * То есть, если дан массив значений [1, 2, 3], и массив весов [1, 2, 10],
 * то можно сразу создать массив [1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3] и извлекать из него случайный элемент
 * */
public class Example2 {
    private int[] extendedValues; // значения

    public Example2(int[] values, int[] weights) {
        // Сумма длин всех отрезков
        int sum = 0;
        for (int weight : weights)
            sum += weight;

        extendedValues = new int[sum];
        int cursor = 0;

        for(int i = 0; i < weights.length; i++)
            for(int j = 0; j < weights[i]; j++)
                extendedValues[cursor++] = values[i];
    }

    /*
        Массив extended_values уже заполнен,
        так что остаётся сгенерировать значение в промежутке
        [0; extended_values.length)
     */
    public int getRandom() {
        int random = (int) (Math.random() * (extendedValues.length - 1));
        return extendedValues[random];
    }

    @Override
    public String toString() {
        return "Example2{" +
                "extendedValues=" + Arrays.toString(extendedValues) +
                '}';
    }

    public static void main(String[] args) {
        Example2 exm = new Example2(new int[]{1, 2, 3}, new int[]{1, 2, 10});
        System.out.println(exm);
        System.out.println(exm.getRandom());
    }
}
