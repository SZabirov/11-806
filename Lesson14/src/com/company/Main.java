package com.company;

public class Main {
    public static void main(String[] args) {
//        Car c1 = new Car("A123BC", "Opel");
//        System.out.println(c1);

        Car c1 = new Car("A123BC", "Opel");
        Car c2 = new Car("A123BC", "Opel");
        if (c1.equals(c2)) {
            System.out.println("Они равны");
        }


    }
}


