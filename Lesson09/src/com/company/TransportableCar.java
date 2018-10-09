package com.company;

public class TransportableCar {
    private int weight;
    private int length;
    private int height;
    private int width;
    private String regNumber;
    private String vinCode;

    public TransportableCar(int weight, int length, int height, int width, String vinCode) {
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.width = width;
        this.vinCode = vinCode;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }
}
