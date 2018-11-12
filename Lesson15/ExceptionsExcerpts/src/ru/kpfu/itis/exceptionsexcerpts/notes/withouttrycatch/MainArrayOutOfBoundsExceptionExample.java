package ru.kpfu.itis.exceptionsexcerpts.notes.withouttrycatch;

public class MainArrayOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        MyNotes notes = new MyNotes(5);
        notes.addNote("не забыть поспать");
        String s = notes.getNote(0);
        notes.setNote(0, s + " не забыть поесть");//отредактировали 0-ую заметку
        System.out.println("0-ая заметка: " + notes.getNote(0));
        notes.getNote(5);//попытка получить несуществующую заметку
    }
}
