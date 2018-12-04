package com.company.prirmitives;

public class IterMain {
    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(41);
        list.add(43);
        list.add(45);
        list.add(47);
        Iterator i = list.iterator();
        while (i.hasNext()) {
            int e = i.next();
            System.out.println(e);
        }
    }
}
