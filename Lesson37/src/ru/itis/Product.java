package ru.itis;

public class Product {
    private boolean isReady;

    public void produce() {
        isReady = true;
    }

    public boolean isProduced() {
        return isReady;
    }

    public void consume() {
        isReady = false;
    }

    public boolean isConsumed() {
        return !isReady;
    }
}
