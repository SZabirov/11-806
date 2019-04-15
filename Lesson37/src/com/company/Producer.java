package com.company;

public class Producer extends Thread {
    private Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                while (!product.isConsumed()) {
                    System.out.println("Потреблен ли?");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
                product.produce();
                product.notify();
                System.out.println("Произвел");
            }
        }
    }
}
