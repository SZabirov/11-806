package ru.kpfu.itis.exceptionsexcerpts.notes.interfaceimpl;

public class MyNotes implements Notebook {
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
        if (id >= notes.length) {
            throw new IllegalArgumentException("Такой заметки с номером " + id + " нет");
        }
        return notes[id];
    }

    public void addNote(String text) {
        notes[count] = text;
        count++;
    }
}
