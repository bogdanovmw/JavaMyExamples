package org.example.MyWitcher.java.generics;

import lombok.Data;

import java.util.Arrays;

public class CustomArrayList {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.add("Max");
        list.add("Ivan");
        list.add("Pasha");
        list.add("Alex");
        list.add("Anton");
        list.add("Sergey");


        print(list);
        System.out.println("\nGet element by index = " + list.get(5));
        System.out.println("\nElement removed by index = " + list.remove(0));
        System.out.println("Element removed by index = " + list.remove(1));
        print(list);
    }

    private static void print (CustomList<String> list) {
        System.out.print("Print list: " + list.get(0) + "[" + 0 + "]");
        for (int i = 1; i < list.getSize(); i++) {
            System.out.print(", " + list.get(i) + "[" + i + "]");
        }
    }
}



@Data
class CustomList<E> {
    private static final int CAPACITY = 10;
    private int size = 0;
    private Object elementData[] = {};

    public CustomList() {
        this.elementData = new Object[CAPACITY];
    }

    private void ensureCapacity () {
        int newCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public void add(E element) {
        if (size == elementData.length) {
            ensureCapacity();
        }
        elementData[size++] = element;
    }

    private void extracted(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
    }

    @SuppressWarnings("unchecked") // используется для подавления предупреждений компилятора
    public E get(int index) {
        extracted(index);
        return (E) elementData[index];
    }

    public Object remove(int index) {
        extracted(index);
        Object element = elementData[index];
        for (int i = index; i < size - 1; i++)
            elementData[i] = elementData[i + 1];
        size--;

        return element;
    }
}
