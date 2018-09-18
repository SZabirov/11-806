package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	    int[] arr = {1, 3, 2, 0, 5, 4};
	    int[] arr1 = {8, 6, 0, 3};
	    int[] arr2 = {7, 5, 1, 2};
	    sort(arr);
	    sort(arr1);
	    sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int indexOfMin = 0;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            int buf = arr[indexOfMin];
            arr[indexOfMin] = arr[n - i - 1];
            arr[n - i - 1] = buf;
        }
    }
}















