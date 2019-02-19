package com.company.comparators;

public class AudioTrack implements Comparable<AudioTrack> {
    int duration;
    String title;
    String author;

    public AudioTrack(int duration, String title, String author) {
        this.duration = duration;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(AudioTrack o) {
        return duration - o.duration;
    }

    @Override
    public String toString() {
        return "AudioTrack{" +
                "duration=" + duration +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
