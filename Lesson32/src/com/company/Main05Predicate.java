package com.company;

import java.util.function.Predicate;

public class Main05Predicate {
    public static void main(String[] args) {
        Predicate<String> p = s -> s.charAt(0) == 'a' ||
                        s.charAt(0) == 'A';
    }
}
