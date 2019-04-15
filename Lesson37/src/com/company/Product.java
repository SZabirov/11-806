package com.company;

public class Product {
    private boolean isReady;

    public boolean isProduced() {
        return isReady;
    }

    public boolean isConsumed() {
        return !isReady;
    }

    public void produce() {
        isReady = true;
    }

    public void consume() {
        isReady = false;
    }
}
