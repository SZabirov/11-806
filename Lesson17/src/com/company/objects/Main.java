package com.company.objects;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ObjectArrayList list = new ObjectArrayList();
        list.add("haha");
        list.add("abc");
        String str = (String) list.get(0);
        list.add(new Scanner(System.in));
        list.add("cderea");
        printUpperStrings(list);
//        String s = (String) list.get(0);
//        System.out.println(s);
//        Iterator iter = list.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }


    }

    static void printUpperStrings(ObjectArrayList oal) {
        for (Object o : oal) {
            String upperStr = ((String) o).toUpperCase();
            System.out.println(upperStr);
        }
    }
}



