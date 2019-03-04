package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main04 {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("file1.txt");
        char[] text = new char[20];
        int length = r.read(text);
        String s = new String(text, 0, length);
        System.out.println(s);
    }
}
