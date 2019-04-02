package com.company;

public class Student {
    private int age;
    public String name;
    private int countOfDopkas;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", countOfDopkas=" + countOfDopkas +
                '}';
    }
}
