package com.company.v2;

public class NotepadImpl implements Notepad {
    @Override
    public void addNote(String note) {
        System.out.println(System.nanoTime() + " " + note);
    }
}
