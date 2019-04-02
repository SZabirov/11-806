package com.company;

import java.lang.reflect.Field;

public class Main5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student s = new Student("aaa");
        Class c = s.getClass();
        Field f = c.getDeclaredField("countOfDopkas");
        f.setAccessible(true);
        f.set(s, 9);
        System.out.println(s);
    }
}
