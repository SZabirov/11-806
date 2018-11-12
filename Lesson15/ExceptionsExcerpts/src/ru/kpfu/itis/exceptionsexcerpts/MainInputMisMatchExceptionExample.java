package ru.kpfu.itis.exceptionsexcerpts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainInputMisMatchExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner("a + 2");//будет "сканировать" из данной строки
        int x = sc.nextInt();
        System.out.println(x);
    }
}

class MainInputMisMatchExceptionExampleTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner("a + 2");
        int x = 0;
        try {
            x = sc.nextInt();
            System.out.println(x);
        } catch (InputMismatchException e) {//"поймали" исключение, как-то его обработали
            System.out.println("Cо входной строкой что-то не то");
        }
        System.out.println(x);
    }
}