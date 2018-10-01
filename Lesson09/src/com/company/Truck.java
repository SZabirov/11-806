package com.company;

public class Truck {
    int maxCarCount;
    TransportableCar[] cars;
    int carsCount;

    Truck (int maxCarCount) {
        this.maxCarCount = maxCarCount;
        this.carsCount = 0;
        this.cars = new TransportableCar[maxCarCount];
    }

    void addCar(TransportableCar car) {
        cars[carsCount] = car;
        carsCount++;
    }

    void deleteCar(TransportableCar car) {

    }
}
