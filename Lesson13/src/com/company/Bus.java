package com.company;

public class Bus extends Vehicle {
    int passengersCapacity;

    Bus(String registrationNumber, int passengersCapacity) {
        super(registrationNumber);
        this.passengersCapacity = passengersCapacity;
    }

    void closeAllDoors() {
        System.out.println("Осторожно, двери закрываются!");
    }

    @Override
    void drive() {
        System.out.println("Держитесь за поручни, поехали.");
    }

    void finishDrive() {
        super.drive();
    }
}
