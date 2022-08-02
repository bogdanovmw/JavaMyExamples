package org.example.MyWitcher.algorithms.check_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Найти все простые числа
public class RandomPrimeNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(eratosfenPrimes(1000).toArray()));
    }

    //Решето Эратосфена
    public static List<Integer> eratosfenPrimes(int max){
        boolean[] isPrime = new boolean[max];
        Arrays.fill(isPrime, true);

        /**
         * i * i < max - быстрее
         * i < Math.sqrt(max) - медленнее
         * */
        for (int i = 2; i * i < max; i++) {
            if (isPrime[i]){
                for (int j = 2 * i; j < max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            if (isPrime[i]){
                primes.add(i);
            }
        }
        return primes;
    }
}
