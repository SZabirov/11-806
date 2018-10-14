package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileLexicalDictionary {
    private final static String INPUT_FILE_NAME = "in.txt";
    private final static int LETTERS_NUMBER = 26;

    private boolean isSorted = false;
    int wordsCount = 0;

    public FileLexicalDictionary(String ... words) throws IOException {
        this();
        for (String word : words) {
            add(word);
        }
    }

    public FileLexicalDictionary() throws IOException {
        deleteInputFile();
    }

    /**
     * Adds specified word to a dictionary
     */
    public void add(String word) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(new File(INPUT_FILE_NAME), true));
        pw.println(word);
        pw.close();
        wordsCount++;
        isSorted = false;
    }

    /**
     * Sorts all the added words in alphabet order
     */
    public void sort() throws IOException {
        int len = longestWordLength();
        for (int i = len - 1; i >= 0; i--) {
            distributeToFiles(i);
            merge();
        }
        for (char c = 'a'; c <= 'z'; c++) {//deleting all no longer needed files
            File f = new File("out" + c + ".txt");
            if (f.exists()) {
                //fixme file deletion is not working
                f.delete();
            }
        }
        isSorted = true;
    }

    public String getDictionaryWordsAsString() throws IOException {
        //todo add check whether the words are sorted
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(new File(INPUT_FILE_NAME));
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine());
            sb.append("; ");
        }
        return sb.toString();
    }

    public String[] getDictionaryWordsAsArray() throws IOException {
        //todo add check whether the words are sorted
        String[] words = new String[wordsCount];
        Scanner sc = new Scanner(new File(INPUT_FILE_NAME));
        for (int i = 0; i < wordsCount; i++) {
            words[i] = sc.nextLine();
        }
        return words;
    }

    /**
     * Merges all words from outa.txt to outz.txt respectively
     * into source file {@link FileLexicalDictionary#INPUT_FILE_NAME}
     */
    private void merge() throws IOException {
        PrintWriter pw = new PrintWriter(new File(INPUT_FILE_NAME));
        Scanner[] scanners = new Scanner[LETTERS_NUMBER];
        for (int i = 0; i < LETTERS_NUMBER; i++) {
            char letter = (char) (i + 'a');
            scanners[i] = new Scanner(new File("out" + letter + ".txt"));
        }
        for (int i = 0; i < LETTERS_NUMBER; i++) {
            while (scanners[i].hasNextLine()) {
                String s = scanners[i].nextLine();
                pw.println(s);
            }
        }
        //todo add Scanners closing
        pw.close();
    }

    /**
     * Places each word in the right file
     * according to k'th letter
     */
    private void distributeToFiles(int k) throws IOException {
        Scanner sc = new Scanner(new File(INPUT_FILE_NAME));
        PrintWriter[] pws = new PrintWriter[LETTERS_NUMBER];
        for (int i = 0; i < LETTERS_NUMBER; i++) {
            char letter = (char) (i + 'a');
            pws[i] = new PrintWriter(new File("out" + letter + ".txt"));
        }
        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            char c = k < word.length() ? word.charAt(k) : 'a';
            pws[c - 'a'].println(word);
        }
        for (PrintWriter pw : pws) {
            pw.close();
        }
    }

    /**
     * Returns the longestWordLength of the longest word in a file
     */
    private int longestWordLength() throws IOException {
        Scanner sc = new Scanner(new File(INPUT_FILE_NAME));
        int max = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int currentStringLength = s.length();
            if (currentStringLength > max) {
                max = currentStringLength;
            }
        }
        return max;
    }

    /**
     * Deletes input file
     */
    private void deleteInputFile() throws IOException {
        PrintWriter pw = new PrintWriter(new File(INPUT_FILE_NAME));
        pw.close();
    }
}
