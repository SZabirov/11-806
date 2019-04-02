package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public class Main7 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Student> c = Student.class;

        //запрашиваем конструктор, принимающий единственный параметр - строку
        Class[] paramTypes = {String.class};
        Constructor<Student> constructor =
                c.getConstructor(paramTypes);

        //вызываем полученный конструктор
        Student s = constructor.newInstance("Salavat");

        s.setAge(22);
        System.out.println(s);
    }
}
