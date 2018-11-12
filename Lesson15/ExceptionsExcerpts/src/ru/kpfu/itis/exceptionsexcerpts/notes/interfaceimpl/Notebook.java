package ru.kpfu.itis.exceptionsexcerpts.notes.interfaceimpl;

public interface Notebook {
    void setNote(int id, String text);

    String getNote(int id);

    void addNote(String text);
}
