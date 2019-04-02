package com.company;

public class Main7 {
    public static void main(String[] args) {
        Student s = new Student("haha");
        s.name = "abc";
        Class aClass = s.getClass();
        System.out.println(aClass.getName());
    }
}
