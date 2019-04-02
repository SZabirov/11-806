package com.company;

import java.lang.reflect.Field;

public class Main5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class c = Student.class;
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getType() + " " +
                    f.getName());
        }

        Field nameField = c.getDeclaredField("name");
        Class myClass = nameField.getType();
        String s = myClass.getName();
    }
}
