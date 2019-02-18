package com.company.hashcode;

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
    public int hashCode() {
        int result = 1;
        result = result * 31 + duration;
        result = result * 31 + title.hashCode();
        result = result * 31 + author.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {//излишнее условие, покрывается проверкой на instanceof
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioTrack)) {//null не пройдет проверку
            return false;
        }
        AudioTrack audioTrack = (AudioTrack) obj;
        return this.duration == audioTrack.duration &&
                this.author.equals(audioTrack.author) &&
                this.title.equals(audioTrack.title);
    }

    @Override
    public int compareTo(AudioTrack o) {
        return duration - o.duration;//сравнение по продолжительности
    }


}
