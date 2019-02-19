package com.company;

public class StringBuilderExample {
    public static void main(String[] args) {
        String string = "ab.c";
        string.replace(".", "");//игнорируем результат работы replace;
        System.out.println(string);
//        String s = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            //s += "abc"; - так не надо
            sb.append("abc");
        }
        String result = sb.toString();
        System.out.println(result.charAt(100));
    }
}
