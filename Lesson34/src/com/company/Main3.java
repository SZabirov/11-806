package com.company;

import java.lang.reflect.Field;

public class Main3 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class c = Student.class;
        Field f = c.getDeclaredField("age");
        System.out.println(f.getType());
    }
}
