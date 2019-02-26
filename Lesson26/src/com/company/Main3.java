package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main3 {
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
        double s = sum(integerList);
        System.out.println(s);
    }

//    private static <T extends Number> double sum(List<T> nums) {

    private static double sum(List<? extends Number> nums) {
        double sum = 0;
        for (Number n : nums) {
            sum += n.doubleValue();
        }
        Double d = 0.0;
//        nums.add(d); - менять не можем, т к не знаем конкретного типа
        return sum;
    }
}







