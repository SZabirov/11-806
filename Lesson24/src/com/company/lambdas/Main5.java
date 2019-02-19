package com.company.lambdas;

public class Main5 {
    public static void main(String[] args) {
        //для приведения строки к нижнему регистру
        TextProcessingRule lowerCaseRule = s -> s.toLowerCase();
        TextProcessingRule commaDeleteRule = s -> s.replace(",", "");

        String[] lines = {"a,b.c", "he.llo", "H..HH,hh"};
        TextProcessor tp = new TextProcessor(lines);
        tp.process(lowerCaseRule);
        tp.process(commaDeleteRule);
        tp.show();
    }
}
