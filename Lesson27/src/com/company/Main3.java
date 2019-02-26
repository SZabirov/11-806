package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Number> numList = new LinkedList<>();
        numList.add(new Integer(5));
        numList.add(new Double(5.9));
        System.out.println(sum(numList));

        List<Integer> integerList = new LinkedList<>();
        integerList.add(5);
        integerList.add(7);
//        integerList.add(new EvenIntNumber(98)); - нельзя
        System.out.println(sum(integerList));
        oldSum(numList);
        oldSum(integerList);
//        oldSum(new LinkedList<String>());

    }

    private static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        Number ein = new EvenIntNumber(6);
//        list.add(ein); //нельзя - не уверены, какого типа значения
        return sum;
    }

    private static <T extends Number> double oldSum(List<T> list) {
        Number ein = new EvenIntNumber(6);
//        list.add(ein);
        return 0;
    }
}













