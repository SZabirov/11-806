package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main9 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Student s = new Student("John");
        Class aClass = s.getClass();
        Method m = aClass.getDeclaredMethod(
                "passExam", String.class);
        m.setAccessible(true);
        m.invoke(s, "алгем");
    }
}
