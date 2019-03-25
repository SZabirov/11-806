package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main02 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("pqortn");
        strings.add("aqer");
        strings.add("qewrf");
//        Stream<String> stream = strings.stream();
//        stream = stream.map(s -> s.toUpperCase());
//        List<String> result = stream.collect(Collectors.toList());
//        System.out.println(result);
        strings = strings.stream().map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        List<Integer> l = strings.stream().map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(strings);
    }
}
