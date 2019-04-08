package com.company.v2;

public class NotepadUser {
    @InjectImpl
    private Notepad notepad;
    private String name;

    public void takeNotes(int count) {
        for (int i = 0; i < count; i++) {
            notepad.addNote("Some note");
        }
    }
}
