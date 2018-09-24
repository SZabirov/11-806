package com.company;

public class Main {
    public static void main(String[] args) {
        print1ToN(10);
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int f = n * fact(n - 1);
        return f;
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    static void printNTo1(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }

    //from 1 to n
    static void print1ToN(int n) {
        System.out.println(n);
        if(n > 1) {
            print1ToN(n - 1);
        }
    }
}






