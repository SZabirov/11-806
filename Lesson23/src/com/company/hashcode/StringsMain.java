package com.company.hashcode;

import java.util.Scanner;

public class StringsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hashCode());
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc2.hashCode());

        String s1 = new String("abc");
        System.out.println(s1.hashCode());
        String s2 = new String("abc");
        System.out.println(s2.hashCode());
    }
}
