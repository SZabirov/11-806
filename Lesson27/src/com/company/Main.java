package com.company;

import javafx.util.Pair;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Main.<Integer, String>compare(p1, p2);

        Integer i1 = 5;
        Integer i2 = 1;
        Integer i3 = 5;
        Double d1 = 10.9;
        max(i1, i2, i3);
        System.out.println("=============");
        Main.<Double>max(0.7, 0.9, 1.6);
        Main.<Integer>min(9, 9);
    }

    private static <T extends Number & Comparable<T>> double max(T num1, T num2, T num3) {
        if (num1.compareTo(num2) > 0) {
            if (num1.compareTo(num3) > 0) {
                return num3.doubleValue();
            }
        }
        return 0;
    }

    private static <T> double min(T o1, T o2) {
        return 0;
    }


    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

}

