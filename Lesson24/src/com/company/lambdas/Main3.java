package com.company.lambdas;

public class Main3 {
    public static void main(String[] args) {
        //анонимный класс
        TextProcessingRule rule = new TextProcessingRule() {
            @Override
            public String process(String s) {
                String result = s.replace(".", "");
                return result;
            }
        };
        String[] lines = {"ab.c", "he.llo", "H..HHhh"};
        TextProcessor tp = new TextProcessor(lines);
        tp.process(rule);
        tp.show();
    }
}
