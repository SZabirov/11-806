package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Number> l = new LinkedList<>();
        l.add(1.0);
        l.add(1.4);
        System.out.println(sum(l));

        List<Integer> integerList = new LinkedList<>();
        integerList.add(5);
        integerList.add(4);
        integerList.add(0);
        //так нельзя
//        double s = sum(integerList);
    }

    private static double sum(List<Number> nums) {
        double sum = 0;
        for (Number n : nums) {
            sum += n.doubleValue();
        }
        Double d = 0.0;
        nums.add(d);//добавили еще один элемент в список
        return sum;
    }
}



