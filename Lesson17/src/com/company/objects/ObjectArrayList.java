package com.company.objects;


import java.util.Iterator;

public class ObjectArrayList implements Iterable {
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

    @Override
    public Iterator iterator() {
        return new MyIter();
    }


    class MyIter implements Iterator {
        private int currentIndex;

        public MyIter() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public Object next() {
            return elements[currentIndex++];
        }
    }
}








