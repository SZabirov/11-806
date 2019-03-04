package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        InputStream is = new FileInputStream("file1.txt");
        Scanner fileScanner = new Scanner(is);
        String s = fileScanner.nextLine();
        System.out.println(s);
    }
}
