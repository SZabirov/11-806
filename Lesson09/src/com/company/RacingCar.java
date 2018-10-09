package com.company;

public class RacingCar {
    //поле (field)
    String color;
    int weight;
    int maxSpeed;
    int currentSpeed;
    boolean isTurnedOn;

    //constructor (НЕ МЕТОД!)
    public RacingCar(String color, int weight, int maxSpeed) {
        this.color = color;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public RacingCar() {

    }

    //method (ф-ия или процедура)
    void accelerate(int kmH) {
        if (currentSpeed + kmH <= maxSpeed) {
            currentSpeed += kmH;
        }
    }

    String turnOn() {
        if (isTurnedOn) {
            return "Автомобиль уже заведен";
        } else {
            isTurnedOn = true;
            return "Автомибиль заведен";
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed <= maxSpeed) {
            this.currentSpeed = currentSpeed;
        } else {
            System.out.println("Current speed is higher than max speed");
        }
    }
}
