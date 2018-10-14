package com.company;

import java.io.IOException;

public class FileLexicalDictionaryUsageTest {
    public static void main(String[] args) throws IOException {
        FileLexicalDictionary fld = new FileLexicalDictionary();
        fld.add("lorem");
        fld.add("ipsum");
        fld.add("dolor");
        fld.add("sit");
        fld.add("amet");
        fld.add("consectetur");
        fld.add("adipiscing");
        fld.add("abcdef");
        fld.add("age");
        fld.add("at");
        fld.add("aycdef");
        fld.add("adipiscing");
        fld.add("elit");
        fld.sort();
        System.out.println(fld.getDictionaryWordsAsString());
    }
}