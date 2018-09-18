package com.company;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        int a = 0;
        setFortyTwo(a);
        System.out.println(a);

        int[] arr = {0, 1, 2, 3};
        setFortyTwo(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] array = generateArr(7);
        System.out.println();
        System.out.println(Arrays.toString(array));
    }

    static void setFortyTwo(int[] arr) {
        arr[0] = 42;
    }

    static void setFortyTwo(int a) {
        a = 42;
    }

    static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
