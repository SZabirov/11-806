package com.company.comparators;

import java.util.Comparator;

public class ByDurationComparator implements Comparator<AudioTrack> {
    @Override
    public int compare(AudioTrack o1, AudioTrack o2) {
        return o1.duration - o2.duration;
    }
}
