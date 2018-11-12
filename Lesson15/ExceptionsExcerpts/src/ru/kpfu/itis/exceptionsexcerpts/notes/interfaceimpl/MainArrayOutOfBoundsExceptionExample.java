package ru.kpfu.itis.exceptionsexcerpts.notes.interfaceimpl;

public class MainArrayOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        Notebook notebook = new MyNotes(5);
        String text = notebook.getNote(5);
        System.out.println(text);
    }
}
