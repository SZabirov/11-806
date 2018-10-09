package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("in.txt");
        Scanner sc1 = new Scanner(f1);
        File f2 = new File("in2.txt");
        Scanner sc2 = new Scanner(f2);
        File out = new File("out.txt");
        PrintWriter pw = new PrintWriter(out);
        int a = 0, b = 0;
        while (sc1.hasNextInt() && sc2.hasNextInt()) {
            a = sc1.nextInt();
            b = sc2.nextInt();
            int sum = a + b;
            pw.println(sum);
        }
        while (sc1.hasNextInt()) {
            a = sc1.nextInt();
            pw.println(a);
        }
        while (sc2.hasNextInt()) {
            b = sc2.nextInt();
            pw.println(b);
        }
        pw.close();
    }
}
