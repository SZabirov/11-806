package com.company;

public class CompareArrays {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean arraysAreEqual = true;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    arraysAreEqual = false;
                }
            }
        } else {
            arraysAreEqual = false;
        }
//        if (arr1 == arr2) {
//            System.out.println("Они равны");
//        } else {
//            System.out.println("Не равны");
//        }
    }
}
