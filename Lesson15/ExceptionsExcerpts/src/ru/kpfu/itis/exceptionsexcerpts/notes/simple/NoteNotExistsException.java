package ru.kpfu.itis.exceptionsexcerpts.notes.simple;

public class NoteNotExistsException extends Exception {
    public NoteNotExistsException(String message) {
        super(message);
    }
}
