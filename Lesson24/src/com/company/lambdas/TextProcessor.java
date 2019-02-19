package com.company.lambdas;

import java.util.Arrays;

public class TextProcessor {
    private String[] strings;

    public TextProcessor(String[] strings) {
        this.strings = strings;
    }

    //обрабатывает все строки по конкретному правилу
    //конкретное правило - это некоторое реализация
    public void process(TextProcessingRule rule) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = rule.process(strings[i]);
        }
    }

    public void show() {
        System.out.println(Arrays.toString(strings));
    }

}
