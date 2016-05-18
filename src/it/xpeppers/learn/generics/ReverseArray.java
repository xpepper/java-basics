package it.xpeppers.learn.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray<T> {

    private T[] array;

    public ReverseArray(T[] array) {
        this.array = array;
    }

    public T[] reverse() {
        if (array == null) {
            return null;
        }

        T[] copy = array.clone();
        List<T> asList = Arrays.asList(copy);
        Collections.reverse(asList);

        return asList.toArray(copy);
    }
}
