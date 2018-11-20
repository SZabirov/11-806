package ru.kpfu.itis.textsimilarity;

import java.util.Scanner;

public class SimpleSearchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь до папки:");
        String filePath = sc.nextLine();
        System.out.println("Введите поисковый запрос");
        String query = sc.nextLine();
        SearchEntryPoint searchEntryPoint = new SearchEntryPoint();
        searchEntryPoint.printResults(query, filePath);
    }
}
