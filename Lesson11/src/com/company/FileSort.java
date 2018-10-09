package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSort {
    public static void main(String[] args) throws IOException {
        int length = maxLength();
        for (int i = 0; i < length; i++) {
            sortInFiles(i);
            merge();
        }
    }

    static void merge() throws IOException {
        PrintWriter pw = new PrintWriter(new File("in.txt"));
        Scanner[] scanners = new Scanner[10];
        for (int i = 0; i < 10; i++) {
            scanners[i] = new Scanner(new File("out" + i + ".txt"));
        }
        for (int i = 0; i < 10; i++) {
            while (scanners[i].hasNextInt()) {
                pw.println(scanners[i].nextInt());
            }
        }
        pw.close();
    }

    static void sortInFiles(int k) throws IOException {
        PrintWriter[] printWriters = new PrintWriter[10];
        for (int i = 0; i < 10; i++) {
            printWriters[i] = new PrintWriter(new File("out" + i + ".txt"));
        }
        Scanner sc = new Scanner(new File("in.txt"));
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            int c = x;
            for (int i = 0; i < k; i++) {
                c = c / 10;
            }
            printWriters[c % 10].println(x);
        }
        for (int i = 0; i < 10; i++) {
            printWriters[i].close();
        }
    }

    static int maxLength() throws IOException {
        Scanner sc = new Scanner(new File("in.txt"));
        int max = 0;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            int numLength = (int) Math.log10(x) + 1;
            if (numLength > max) {
                max = numLength;
            }
        }
        return max;
    }
}
