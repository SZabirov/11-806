package com.company.hashcode;

import java.util.Arrays;

public class StringHashcodeCollision {
    public static void main(String[] args) {
        int[] arr = new int[16];
        for (int i = 0; i < 10000; i++) {
            String s = getRandomString();
            int hash = s.hashCode();
            int index = Math.abs(hash) % 16;
            arr[index]++;
        }
        System.out.println(Arrays.toString(arr));
    }

    static String getRandomString() {
        return "abcdef";//fixme генерировать случайную строку
    }
}
