package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntListTestMain {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        list.add(42);
        list.add(45);
        list.add(47);
        list.remove(0);
        System.out.println(list.get(1));
    }
}
