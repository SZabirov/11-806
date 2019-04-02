package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main6 {
    static int x;

    public static void main(String[] args) throws NoSuchFieldException {
        Class c = Main6.class;
        Field f = c.getDeclaredField("x");
        System.out.println(Modifier.toString(f.getModifiers()));
    }
}
