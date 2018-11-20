package ru.kpfu.itis.textsimilarity;


import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileTextProvider implements TextProvider {
//    private Logger logger = new Logger();
    private BetterLogger betterLogger = BetterLogger.getInstance();
    private File input;

    public FileTextProvider(File input) {
        this.input = input;
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = null;
        try {
            sc = new Scanner(input);
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            betterLogger.error("Файл не найден");
            throw new IllegalArgumentException(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        return sb.toString();
    }

    public File getInput() {
        return input;
    }
}
