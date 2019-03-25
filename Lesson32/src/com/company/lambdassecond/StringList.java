package com.company.lambdassecond;

public class StringList {
    String[] arr;

    void processAllStrings(MyFunction function) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = function.m(arr[i]);
        }
    }
}
