package com.company;

public class Consumer extends Thread {
    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                while (!product.isProduced()) {
                    System.out.println("Произведен ли?");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
                product.consume();
                product.notify();
                System.out.println("Потребил");
            }
        }
    }
}
