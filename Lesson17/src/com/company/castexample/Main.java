package com.company.castexample;

public class Main {
    public static void main(String[] args) {
        SuperHuman sh = new SuperHuman();
        sh.eat();
        sh.programming();

        Human h = sh;
        h.eat();
//        h.programming(); - нельзя

        SuperHuman sh2 = (SuperHuman) h;//приведение типа к SuperHuman
        sh2.programming();

        Human simpleHuman = new Human();
        ((SuperHuman) simpleHuman).programming();//ClassCastException, тк не является на самом деле SuperHuman
    }

    static void live(Human h) {
        h.eat();
    }
}
