package org.example.MyWitcher.java.oop.immutable;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Car car = new Car("Test", map);
        System.out.println(car);
    }
}
