package com.company;

public class Calculator {
    public int fact(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n = " + n);
        }
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public boolean isSquare(int n) {
        int s = (int) Math.sqrt(n);
        return s * s == n;
    }
}
