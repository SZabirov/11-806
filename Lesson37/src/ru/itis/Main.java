package ru.itis;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        Consumer consumer = new Consumer(p);
        Producer producer = new Producer(p);
        consumer.start();
        producer.start();
    }
}
