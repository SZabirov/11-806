package com.company;

public class SortedPlayList {
    private AudioTrack[] arr;
    int n = 0;

    public SortedPlayList(int size) {
        this.arr = new AudioTrack[size];
    }

    //вставляет новый трек в массив так, чтобы
    //треки в нем остались упорядочены
    public void add(AudioTrack audioTrack) {
        int c = 0;
        while (arr[c].compareTo(audioTrack) <= 0) {
            c++;
        }
    }
}
