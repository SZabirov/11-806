package com.company;

import java.util.Arrays;

public class ArrayLexicalDictionary {
    private final static int DEFAULT_ARRAY_CAPACITY = 10;
    private final static int DEFAULT_INCREASE_TIMES = 2;

    String[] words;
    int wordsCount = 0;

    public ArrayLexicalDictionary() {
        words = new String[DEFAULT_ARRAY_CAPACITY];
    }

    public void add(String word) {
        if (wordsCount == words.length) {
            expandArraySize();
        }
        words[wordsCount] = word;
        wordsCount++;
    }

    public void sort() {
        //creating new array without null-values in order to simplify sorting
        String[] arrayToSort = Arrays.copyOf(words, wordsCount);
        Arrays.sort(arrayToSort);
        System.arraycopy(arrayToSort, 0, words, 0, arrayToSort.length);
    }

    private void expandArraySize() {
        String[] newWords = new String[words.length * DEFAULT_INCREASE_TIMES];
        System.arraycopy(words, 0, newWords, 0, words.length);
        words = newWords;
    }

    public String getDictionaryWordsAsString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < wordsCount; i++) {
            sb.append(words[i] + "; ");
        }
        return sb.toString();
    }

    public String[] getDictionaryWordsAsArray() {
        return words.clone();
    }
}
