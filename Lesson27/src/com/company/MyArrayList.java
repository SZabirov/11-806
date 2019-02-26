package com.company;

public class MyArrayList<T> {
    private T[] arr;
    private int n = 0;

    public MyArrayList() {
        this.arr = (T[]) new Object[10];
    }

    public void add(T elem) {
        arr[n++] = elem;
    }

    public T get(int index) {
        return arr[index];
    }

    T[] toArray() {
        return arr;
    }
}
