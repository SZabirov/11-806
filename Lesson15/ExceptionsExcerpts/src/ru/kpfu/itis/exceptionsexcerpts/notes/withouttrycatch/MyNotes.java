package ru.kpfu.itis.exceptionsexcerpts.notes.withouttrycatch;

public class MyNotes {
    private String[] notes;
    private int count;

    public MyNotes(int maxCapacity) {
        notes = new String[maxCapacity];
        count = 0;
    }

    public void setNote(int id, String text) {
        notes[id] = text;
    }

    public String getNote(int id) {
        return notes[id];
    }

    public void addNote(String text) {
        notes[count] = text;
        count++;
    }
}
