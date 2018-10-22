package com.company;

import java.util.Objects;

public class Car {
    private String registrationNumber;
    private String mark;

    Car(String registrationNumber, String mark) {
        this.registrationNumber = registrationNumber;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
