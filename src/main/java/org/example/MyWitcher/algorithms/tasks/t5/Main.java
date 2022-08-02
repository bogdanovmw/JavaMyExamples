package org.example.MyWitcher.algorithms.tasks.t5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Постройте частотный словарь букв русского (или английского) алфавита.
 * Опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины).
 * */
public class Main {
    public static void main(String[] args) {
        buildDictionaryWithMap("Петр");
    }

    static void buildDictionaryWithMap(String text) {
        text = text.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if ((ch >= 'a' && ch <= 'я') || ch == 'ё')
                map.compute(ch, (character, integer) -> integer == null ? 1 : integer + 1);
        }

        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for(Map.Entry<Character, Integer> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
