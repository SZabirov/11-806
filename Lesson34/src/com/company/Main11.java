package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main11 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<Student> c = Student.class;
        Constructor<Student> constructor =
                c.getConstructor(String.class);
        Student s = constructor.newInstance("John");
        System.out.println(s);
    }
}
