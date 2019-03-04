package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main03 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("file2.txt");
        byte[] bytes = new byte[20];
        int length = is.read(bytes);
        String result = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(result);
    }
}






