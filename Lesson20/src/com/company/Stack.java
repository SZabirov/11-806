package com.company;

public class Stack {
    private char[] elements;
    private int n;

    public Stack(int capacity) {
        elements = new char[capacity];
        n = 0;
    }

    public void push(char c) {
        if (n == elements.length) {
            throw new IllegalStateException("Stack is already full");
        }
        elements[n++] = c;
    }

    public char pop() {
        if (n == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[--n];
    }

    public boolean isEmpty() {
        return n == 0;
    }
}
