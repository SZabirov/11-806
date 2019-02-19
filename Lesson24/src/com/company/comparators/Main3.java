package com.company.comparators;

public class Main3 {
    public static void main(String[] args) {
        //задание компаратора с помощью лямбда-выражения
        SortedPlayList playList =
                new SortedPlayList(((o1, o2) -> o1.duration - o2.duration));
        AudioTrack t1 = new AudioTrack(200, "a", "c");
        AudioTrack t2 = new AudioTrack(140, "s", "b");
        AudioTrack t3 = new AudioTrack(450, "d", "c");
        AudioTrack t4 = new AudioTrack(20, "f", "b");
        playList.add(t1);
        playList.add(t2);
        playList.add(t3);
        playList.add(t4);
        playList.show();
    }
}
