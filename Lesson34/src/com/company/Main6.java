package com.company;

public class Main6 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<Student> c = Student.class;
        Student s = c.newInstance();//вызывает конструктор без параметров (если такого нет, ошибка)
        s.setAge(25);
        System.out.println(s);
    }
}
