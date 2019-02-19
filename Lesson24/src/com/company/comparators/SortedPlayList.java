package com.company.comparators;

import java.util.Comparator;

public class SortedPlayList {
    private static final int SIZE = 10;
    private AudioTrack[] arr;
    int n = 0;
    private Comparator<AudioTrack> comparator;

    public SortedPlayList() {
        this.arr = new AudioTrack[SIZE];
    }

    public SortedPlayList(Comparator<AudioTrack> comparator) {
        this();//вызов конструктора без параметров
        this.comparator = comparator;
    }

    //вставляет новый трек в массив так, чтобы
    //треки в нем остались упорядочены
    public void add(AudioTrack audioTrack) {
        int c = 0;
        if (comparator == null) {
            //если не передали компаратор,то сравниваем через compareTo
            while (c < n && arr[c].compareTo(audioTrack) <= 0) {
                c++;
            }
        } else {//если задали какой-то компаратор, то применяем порядок, заданный компаратором
            while (c < n && comparator.compare(arr[c], audioTrack) <= 0) {
                c++;
            }
        }
        //сделать смещение с c-го элемента до n - 1
        for (int i = n - 1; i >= c; i--) {
            arr[i + 1] = arr[i];
        }
        arr[c] = audioTrack;
        n++;
    }

    void show() {
        for(AudioTrack track : arr) {
            System.out.println(track);
        }
    }
}
