package com.company.hashcode;

public class AudioTrackHashcodeMain {
    public static void main(String[] args) {
        AudioTrack at1 = new AudioTrack(120, "abc", "cde");
        AudioTrack at2 = new AudioTrack(240, "abc", "cde");
        boolean b = at1.equals(at2);
        System.out.println(b);

        boolean a = at1.equals("abc");
        System.out.println(a);
    }
}
