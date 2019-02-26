package com.company;

public class Main1 {

    public static void main(String[] args) {
//	    inspect("aaaa");
        Integer i1 = 3;
        Integer i2 = 4;
        Integer i3 = 1;
        max(i1, i2, i3);
    }

    public static <U extends Number> void inspect(U u){
        System.out.println("U: " + u.getClass().getName());
    }

    private static <T extends Number & Comparable<T>> T max(T num1, T num2, T num3) {
        if (num1.compareTo(num2) > 0) {
            return num1;//непраивльно работает
        }
        return null;
    }
}
