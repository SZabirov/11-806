package com.company.lambdas;

public class Main6 {
    public static void main(String[] args) {
        String[] lines = {"a, b. c", "he. llo", "H... HH, hh"};
        TextProcessor tp = new TextProcessor(lines);
        tp.process(s -> s.replace(" ", ""));
        tp.show();
    }
}
