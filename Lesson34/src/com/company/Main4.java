package com.company;

import java.lang.reflect.Field;

public class Main4 {
    public static void main(String[] args) {
        Class<Student> c = Student.class;
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getType() +
                    " " + f.getName());
        }
    }
}
