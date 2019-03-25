package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main04Filter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("pqortn");
        strings.add("aqer");
        strings.add("qewrf");

        //with Predicate interface
        List<String> aStrings = strings.stream()
                .filter(s -> s.charAt(0) == 'a' ||
                        s.charAt(0) == 'A')
                .collect(Collectors.toList());
        System.out.println(aStrings);
    }
}
