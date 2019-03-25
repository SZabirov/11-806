package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main01 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("pqortn");
        strings.add("aqer");
        strings.add("qewrf");
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, strings.get(i).toUpperCase());
        }
        System.out.println(strings);
    }
}







