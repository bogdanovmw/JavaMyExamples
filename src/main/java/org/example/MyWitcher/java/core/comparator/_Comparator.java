package org.example.MyWitcher.java.core.comparator;

import org.example.MyWitcher.algorithms.sort.countsort.CountSortObjects;

import java.util.*;

public class _Comparator {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(array));

        ArrayList<CountSortObjects.Worker> workerList = new ArrayList<>();
        workerList.add(new CountSortObjects.Worker(123, "Васильев Евстахий Борисович", "+129381832", 5));
        workerList.add(new CountSortObjects.Worker(151, "Коновалов Степан Петрович", "+234432334", 7));
        workerList.add(new CountSortObjects.Worker(332, "Калинин Артём Валериевич", "+2234234423", 2));
        workerList.add(new CountSortObjects.Worker(432, "Предыбайло Григорий Анатолиевич", "+2342344234", 5));
        workerList.add(new CountSortObjects.Worker(556, "Степанов Мирослав Андреевич", "+6678877777", 3));
        workerList.add(new CountSortObjects.Worker(556, "Пупкин Василий Степанович", "+6678877777", 2));

        Collections.sort(workerList, new Comparator<CountSortObjects.Worker>() {
            @Override
            public int compare(CountSortObjects.Worker o1, CountSortObjects.Worker o2) {
                int result =  o1.qualification - o2.qualification;
                if (result == 0) {
                    return o1.name.compareTo(o2.name);
                }
                return result;
            }
        });

        for(CountSortObjects.Worker worker : workerList){
            System.out.println(worker);
        }
    }
}
