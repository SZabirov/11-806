package com.company;

import java.io.IOException;

public class ArrayLexicalDictionaryUsageTest {
    public static void main(String[] args) throws IOException {
        ArrayLexicalDictionary ald = new ArrayLexicalDictionary();
        ald.add("lorem");
        ald.add("ipsum");
        ald.add("dolor");
        ald.add("sit");
        ald.add("amet");
        ald.add("consectetur");
        ald.add("adipiscing");
        ald.add("abcdef");
        ald.add("age");
        ald.add("at");
        ald.add("aycdef");
        ald.add("adipiscing");
        ald.add("elit");
        ald.sort();
        System.out.println(ald.getDictionaryWordsAsString());
    }
}
