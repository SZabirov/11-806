package com.company;

import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println("Введите искомое слово:");
        String strToFind = sc.next();
        int strIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(strToFind)) {//str.equals("abc");
                strIndex = i;
            }
        }
        System.out.println(strIndex);
    }
}
