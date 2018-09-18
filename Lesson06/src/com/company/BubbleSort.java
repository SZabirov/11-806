package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 0, 4};
        int[] arr1 = {7, 0, 1, 2, 3, 4, 5, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int n = arr.length;
        boolean wasChangedOnLastIteration = true;
        for (int i = 0; i < n & wasChangedOnLastIteration; i++) {
            wasChangedOnLastIteration = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                    wasChangedOnLastIteration = true;
                }
            }
        }
    }
}
