package com.company;

public class Main {

    public static void main(String[] args) {
        AudioTrack a1 = new AudioTrack();
        a1.duration = 200;
        AudioTrack a2 = new AudioTrack();
        a2.duration = 100;
        int x = a1.compareTo(a2);
    }
}
