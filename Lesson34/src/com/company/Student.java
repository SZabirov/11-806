package com.company;

import javax.swing.text.html.HTMLDocument;

public class Student {
    private int age;
    public String name;
    private Iterable i;

    public Student(String name) {
        this.name = name;
    }

    private void passExam(String exam) {
        System.out.println(exam + " ваще на изи, " +
                "всё списал, ваще не палил");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
