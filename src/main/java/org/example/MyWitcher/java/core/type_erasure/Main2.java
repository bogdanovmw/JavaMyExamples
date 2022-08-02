package org.example.MyWitcher.java.core.type_erasure;

public class Main2<T> {
    private T value1;
    private T value2;

    public void printValues() {
        System.out.println(value1);
        System.out.println(value2);
    }

    public static <T> Main2<T> createAndAdd2Values(Object o1, Object o2) {
        Main2<T> result = new Main2<>();
        result.value1 = (T) o1;
        result.value2 = (T) o2;
        return result;
    }

    public static void main(String[] args) {
        Double d = 22.111;
        String s = "Test String";
        Main2<Integer> test = createAndAdd2Values(d, s);
        test.printValues();

    }
}

