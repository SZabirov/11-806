package com.company.lambdas;

public class Main1 {
    public static void main(String[] args) {
        String s = "aAava12; tH";
        TextProcessingRule tpr = new ToUpperCaseProcessingRule();
        String res = tpr.process(s);
        System.out.println(res);
    }
}
