package com.company.firstexample;

public class FunnyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + ". Ha-Ha");
        }
    }
}
