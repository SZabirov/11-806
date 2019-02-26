package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("abc");
        list.add("cdfef");
        Object[] arr = list.toArray();
        for (Object o : arr) {
            String s = (String) o;
            System.out.println(s.toUpperCase());
        }

        for (String s : list) {
            System.out.println(s.toUpperCase());
        }
    }
}
