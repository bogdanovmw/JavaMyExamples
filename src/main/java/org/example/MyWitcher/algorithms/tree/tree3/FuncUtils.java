package org.example.MyWitcher.algorithms.tree.tree3;

import java.util.ArrayList;
import java.util.List;

public class FuncUtils {
    public interface Func1<A, R> {
        R apply(A arg);
    }

    public interface Func2<A, B, R> {
        R apply(A arg1, B arg2);
    }

    public static <X> List<X> filter(List<X> list, Func1<X, Boolean> filterFunction) {
        ArrayList<X> result = new ArrayList<>();
        for(X item: list) {
            if (filterFunction.apply(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
