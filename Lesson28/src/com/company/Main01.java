package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main01 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("file1.txt");
        int x;
        while ((x = is.read()) != -1) {
            System.out.println((char)x);
        }
        char c = '\n';
        System.out.println(c);
    }
}






