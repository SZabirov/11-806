package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {4, 2, 6, 2, 8, 1, 2, 5};
        int[] arr = getRandomArr(1000000);
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Sorter.mergeSort(arr1);
        System.out.println(Arrays.toString(arr1));
        Sorter.selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static int[] getRandomArr(int size) {
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(100000);
        }
        return arr;
    }
}
