package com.company.lambdas;

public class Main4 {
    public static void main(String[] args) {
        //rule, удаляющие точки и запятые через lambda-выражение
        TextProcessingRule rule = s -> {
            String str = s.replace(",", "");
            return str.replace(".", "");
        };
        String[] lines = {"a,b.c", "he.llo", "H..HH,hh"};
        TextProcessor tp = new TextProcessor(lines);
        tp.process(rule);
        tp.show();
    }
}
