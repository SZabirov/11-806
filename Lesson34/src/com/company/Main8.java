package com.company;

public class Main8 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<Student> c = Student.class;
        Student s = c.newInstance();
        s.name = "John";
        System.out.println(s);
    }
}
