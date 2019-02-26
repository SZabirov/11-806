package com.company;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
//        String[] elems = list.toArray();
//        System.out.println(Arrays.toString(elems));

        Object[] arr = {"aa", "ab"};
        String[] strArr = (String[]) arr;
    }
}
