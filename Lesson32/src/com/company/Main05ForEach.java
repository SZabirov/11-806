package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main05ForEach {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("pqortn");
        strings.add("aqer");
        strings.add("qewrf");

        strings.stream().forEach(s -> System.out.println(s));

        strings.stream()
                .map(s -> s.length())
                .forEach(i -> System.out.println(i));
    }
}
