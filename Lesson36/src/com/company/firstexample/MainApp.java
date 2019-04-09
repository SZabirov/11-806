package com.company.firstexample;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);

        FunnyThread funny = new FunnyThread();
        EvilThread evil = new EvilThread();

        funny.start();
        evil.start();


        funny.join();
        evil.join();

        for (int i = 0; i < 1000; i++) {
            System.out.println(i + ". Main!!!");
        }
    }
}
