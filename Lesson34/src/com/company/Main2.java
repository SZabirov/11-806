package com.company;

import java.lang.reflect.Field;

public class Main2 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class c = Student.class;
        Field f = c.getField("age");
        System.out.println(f.getType());
    }
}
