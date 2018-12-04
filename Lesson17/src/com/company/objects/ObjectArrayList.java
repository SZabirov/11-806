package com.company.objects;

public class ObjectArrayList {
    Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int count;

    public ObjectArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        count = 0;
    }

    void add(Object e){
        //add grow(); here
        elements[count++] = e;
    }

    Object get(int index) {
        if (index < 0 || index >= count){
            throw new IllegalArgumentException("Index: " + index + " is not valid");
        }
        return elements[index];
    }
}
