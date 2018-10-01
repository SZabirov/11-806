package com.company;

public class Main {
    public static void main(String[] args) {
        //объект (экземляр класса RacingCar)
//        RacingCar car = new RacingCar("red", 1000, 300);
        RacingCar car = new RacingCar();
        RacingCar mcLaren = new RacingCar("black", 1200, 450);
        car.currentSpeed = 0;
        String carAnswer = car.turnOn();
        System.out.println(carAnswer);
        car.accelerate(10);
        car.accelerate(350);
        System.out.println(car.currentSpeed);

    }
}
