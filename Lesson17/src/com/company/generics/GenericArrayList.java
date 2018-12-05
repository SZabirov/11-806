package com.company.generics;

import java.util.Iterator;

public class GenericArrayList<T> implements Iterable<T>{
    private T[] elements;
    private int count = 0;

    public GenericArrayList() {
        elements = (T[]) new Object[10];
    }

    public void add(T e) {
        elements[count++] = e;
    }

    public T get(int index) {
        return elements[index];
    }


    @Override
    public Iterator<T> iterator() {
        return new MyIter();
    }

    class MyIter implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            return elements[currentIndex++];
        }
    }
}
