package ru.kpfu.itis.textsimilarity;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileTextProvider implements TextProvider {
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
            throw new IllegalArgumentException(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        return sb.toString();
    }
}
