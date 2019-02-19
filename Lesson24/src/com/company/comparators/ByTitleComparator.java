package com.company.comparators;

import java.util.Comparator;

public class ByTitleComparator implements Comparator<AudioTrack> {
    @Override
    public int compare(AudioTrack o1, AudioTrack o2) {
        String title1 = o1.title;
        String title2 = o2.title;
        return title1.compareTo(title2);
    }
}
