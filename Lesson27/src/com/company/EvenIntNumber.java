package com.company;

public class EvenIntNumber extends Number {
    private int value;

    public EvenIntNumber(int x) {
        if (x % 2 == 1) {
            throw new IllegalArgumentException();
        } else {
            value = x;
        }
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
