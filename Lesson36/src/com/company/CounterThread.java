package com.company;

//считает сумму элементов в некотором диапазоне
//из массива
public class CounterThread extends Thread {
    private int[] arr;
    private int start;
    private int end;

    public CounterThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            Main.mainSum += arr[i];
        }
    }
}
