package ru.kpfu.itis.exceptionsexcerpts.notes.simple;

public class MainArrayOutOfBoundsExceptionExample {
    public static void main(String[] args) throws MyNoteException {
        MyNotes notes = new MyNotes(5);
        String text = notes.getNote(5);
        System.out.println(text);
    }
}
