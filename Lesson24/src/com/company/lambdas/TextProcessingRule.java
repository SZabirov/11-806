package com.company.lambdas;

//Данный интерфейс называется функциональным,
//т. к. содержит ровно один абстрактный метод
public interface TextProcessingRule {
    //обрабатывает одну строку
    String process(String s);
}
