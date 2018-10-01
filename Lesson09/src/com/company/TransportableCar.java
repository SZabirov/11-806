package com.company;

public class TransportableCar {
    int weight;
    int length;
    int height;
    int width;
    String regNumber;
    String vinCode;

    public TransportableCar(int weight, int length, int height, int width, String regNumber, String vinCode) {
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.width = width;
        this.regNumber = regNumber;
        this.vinCode = vinCode;
    }

    public TransportableCar(int weight, int length, int height, int width, String vinCode) {
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.width = width;
        this.vinCode = vinCode;
    }

    void load() {
        System.out.println("Авто было погружено");
    }
}
