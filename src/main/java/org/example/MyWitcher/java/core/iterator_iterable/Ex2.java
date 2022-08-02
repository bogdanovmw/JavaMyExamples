package org.example.MyWitcher.java.core.iterator_iterable;

import java.util.Iterator;

public class Ex2 {
    public static void main(String[] args) {
        for (int i : Range.fromTo(0, 100)){
            System.out.println(i);
        }
    }

    private static class Range implements Iterable<Integer> {
        int start;
        int end;

        public static Range fromTo(int from, int to){
            return new Range(from, to);
        }

        private Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new MyIterator(start);
        }

        class MyIterator implements Iterator {
            int current;

            public MyIterator(int current) {
                this.current = current;
            }

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Object next() {
                return current++;
            }
        }
    }
}
