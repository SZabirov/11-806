package com.company;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        String[] names = {"Юлия", "Алена"};
        printAll(names);
        System.out.println("==========");
        printAll("Гульназ", "Аделия");
    }

    private static void printAll(String... strings) {
        Arrays.stream(strings).forEach(
                s -> System.out.println(s));
    }


//    private static void printAll(String[] strings) {
//        Arrays.stream(strings).forEach(
//                s -> System.out.println(s));
//    }
}
