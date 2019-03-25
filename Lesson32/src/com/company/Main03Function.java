package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main03Function {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        Integer i = f.apply("abdf;laksdjfajds");
        System.out.println(i);

        List<String> l = new LinkedList<>();
        List<Integer> ints = l.stream().map(f).collect(Collectors.toList());
    }
}
