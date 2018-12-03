package com.company;

public class IntArrayList implements IntList {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    @Override
    public void add(int e) {
        if (count == elements.length) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = (int) (oldCapacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < oldCapacity; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count){
            throw new IllegalArgumentException("Index: " + index + " is not valid");
        }
        return elements[index];
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void sort() {

    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public void addAll(IntList list) {

    }

    @Override
    public void addAll(IntList list, int index) {

    }
}
