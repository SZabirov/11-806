package com.company;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        String s = sb.toString();
//        String s = "";
//        for (int i = 0; i < 100000; i++) {
//            s += "a";
//        }
    }
}
