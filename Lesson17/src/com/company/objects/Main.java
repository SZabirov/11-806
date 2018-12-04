package com.company.objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ObjectArrayList list = new ObjectArrayList();
        list.add("haha");
        list.add("abc");
        list.add("cderea");
        String s = (String) list.get(0);
        System.out.println(s);
    }

}
