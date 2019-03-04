package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main02 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("file1.txt");
        byte[] bytes = new byte[20];
        int length = is.read(bytes);//вернет кол-во считанных байтов
        System.out.println(length);
        System.out.println(Arrays.toString(bytes));
    }
}






