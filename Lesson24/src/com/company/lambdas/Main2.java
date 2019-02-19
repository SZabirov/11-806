package com.company.lambdas;

public class Main2 {
    public static void main(String[] args) {
        TextProcessingRule tpr = new ToUpperCaseProcessingRule();
        String[] lines = {"abc", "hello", "HHHhh"};
        TextProcessor tp = new TextProcessor(lines);
        tp.process(tpr);
        tp.show();
    }
}
