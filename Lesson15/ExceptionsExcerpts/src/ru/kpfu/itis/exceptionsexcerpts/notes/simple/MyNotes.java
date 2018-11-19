package ru.kpfu.itis.exceptionsexcerpts.notes.simple;

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

    public String getNote(int id) throws NoteNotExistsException {
        if (id >= notes.length || id < 0) {
            throw new NoteNotExistsException("Такой заметки с номером " + id + " нет");
        }
        return notes[id];
    }

    public void addNote(String text) {
        notes[count] = text;
        count++;
    }
}
