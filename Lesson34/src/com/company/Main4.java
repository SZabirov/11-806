package com.company;

import java.lang.reflect.Field;

public class Main4 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student s = new Student("haha");
        Student s1 = new Student("haha");
        Class c = Student.class;
        Field f = c.getDeclaredField("age");
        f.setAccessible(true);
        f.set(s, 90);
        f.set(s1, 89);
        System.out.println(s);
    }
}
