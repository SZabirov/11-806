package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Number> numList = new LinkedList<>();
        numList.add(new Integer(5));
        numList.add(new Double(5.9));
        System.out.println(sum(numList));

        List<Integer> integerList = new LinkedList<>();
        integerList.add(5);
        integerList.add(7);
//        sum(integerList); //нельзя
    }

    private static double sum(List<Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        Double d = 0.9;
        list.add(d);
        return sum;
    }
}
