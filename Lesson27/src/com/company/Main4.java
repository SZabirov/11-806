package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Number> numList = new LinkedList<>();
        numList.add(new Integer(5));
        numList.add(new Double(5.9));
//        System.out.println(sum(numList));

        List<Integer> integerList = new LinkedList<>();
        integerList.add(5);
        integerList.add(7);
//        integerList.add(new EvenIntNumber(98)); - нельзя

//        System.out.println(sum(integerList));
//        oldSum(numList);
//        oldSum(integerList);

//        oldSum(new LinkedList<String>());

    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.set(0, 2);

//        double sum = 0;
//        for (Object n : list) {
//            sum += n.doubleValue();
//        }
    }
}













