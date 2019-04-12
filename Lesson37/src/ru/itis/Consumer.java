package ru.itis;

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
                    System.out.println("Cпросили, произведен ли");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                }
                product.consume();
                System.out.println("Потребил");
                product.notify();
            }
        }
    }
}
