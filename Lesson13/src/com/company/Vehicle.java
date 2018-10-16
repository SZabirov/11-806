package com.company;

public class Vehicle {
    String registrationNumber;

    Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    void drive() {
        System.out.println("Поехали!");
    }
}

