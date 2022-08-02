package org.example.MyWitcher.java.oop.immutable;

import java.util.HashMap;
import java.util.Map;

public final class Car {
    private final String name;
    private final Map<String, String> fieldMap;

    public Car(String name, Map<String, String> fieldMap) {
        this.name = name;
        this.fieldMap = fieldMap;
    }

    public String getName() {
        return name;
    }

    // Глубокая копия
    public Map<String, String> getFieldMap() {
        Map<String, String> deepCopy = new HashMap<>();
        for(String key : fieldMap.keySet()) {
            deepCopy.put(key, fieldMap.get(key));
        }
        return deepCopy;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", fieldMap=" + fieldMap +
                '}';
    }
}
