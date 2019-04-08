package com.company.v1;

public class NotepadUser {
    private Notepad notepad;

    public NotepadUser(Notepad notepad) {
        this.notepad = notepad;
    }

    public void takeNotes(int count) {
        for (int i = 0; i < count; i++) {
            notepad.addNote("Some note");
        }
    }
}
