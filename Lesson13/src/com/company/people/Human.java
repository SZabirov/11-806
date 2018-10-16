package com.company.people;

public class Human {
    private int height;
    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
}
