package com.company.generics;


import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenericArrayList<String> l =
                new GenericArrayList<>();
        l.add("abc");
        l.add("cde");
        l.add("qwerty");
//        l.add(new Integer(5)); - не скомпилируется, т к не String
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
