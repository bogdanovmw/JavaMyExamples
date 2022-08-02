package org.example.MyWitcher.java.core.heap_and_stack;

public class HeapAndStack {
    public static void main(String[] args) {
        int i = 1;
        Object object = new Object();
        HeapAndStack heapAndStack = new HeapAndStack();
        heapAndStack.exMethod(object);
    }

    private void exMethod(Object param) {
        String string = param.toString();
        System.out.println(string);
    }
}
