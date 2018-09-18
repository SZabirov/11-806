package com.company;

public class FunctionExample {
    public static void main(String[] args) {
        int x = sum(3, 7);
        System.out.println(x);
        System.out.println(fact(5));
        sayHello("Petya");
        System.out.println(toUpperCase('b'));
    }

    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    static char toUpperCase(char c) {
        return (char) (c - 32);
    }
}
