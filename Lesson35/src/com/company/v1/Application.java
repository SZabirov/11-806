package com.company.v1;

public class Application {
    public static void main(String[] args) {
        Notepad n = new NotepadImpl();
        NotepadUser user = new NotepadUser(n);
        user.takeNotes(5);
    }
}
