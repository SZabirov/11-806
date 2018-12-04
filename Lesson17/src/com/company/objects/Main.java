package com.company.objects;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ObjectArrayList list = new ObjectArrayList();
        list.add("haha");
        list.add(6);
        list.add("cderea");
//        String s = (String) list.get(0);
//        System.out.println(s);
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        for (Object o : list) {
            System.out.println(o);
        }
    }

}



