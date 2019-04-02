package com.company;

import java.util.Arrays;

public class Main8VarArgs {
    public static void main(String[] args) {
        String[] names = {"Гульназ", "Регина"};
        printAll(names);
        System.out.println("============");
        printAll("Алсу", "Диана", "Альсина");

        String[] arr = {"aaaa", "bbbb"};
        m("abc", "cde", arr);
    }
//
//    private static void printAll(String[] strings) {
//        Arrays.stream(strings).forEach(s -> System.out.println(s));
//    }

    private static void printAll(String... strings) {
        Arrays.stream(strings).forEach(s -> System.out.println(s));
    }

    private static void m(Object... objects) {

    }
}










