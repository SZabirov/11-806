package com.company.generics;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GenericArrayList<String> l =
                new GenericArrayList<>();
        l.add("abc");
        l.add("cde");
        l.add("qwerty");
        String s = l.get(1);
        Iterator<String> iter = l.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
        }
        for (String str : l) {
            System.out.println(str.toUpperCase());
        }
        GenericArrayList<Integer> intList =
                new GenericArrayList<>();
    }
}
