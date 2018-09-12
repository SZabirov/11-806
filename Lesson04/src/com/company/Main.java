package com.company;

public class Main {
    public static void main(String[] args) {
	    //получение числового кода для данного символа
        char c = 'd';
        int intC = c;
        System.out.println(intC);

        //нахождение символа с данным числовым кодом
        int x = 70;
        char charX = (char) x;
        System.out.println(charX);

        //получение числового значения символа-цифры
        char digit = '5';
        int intDigit = digit - '0';
        System.out.println(intDigit);

        //перевод буквы из одного регистра в другой
        char letter = 'H';
        if (letter >= 'A' && letter <= 'Z') {
            letter = (char) (letter + 32);
        } else {
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter - 32);
            }
        }
        System.out.println(letter);
    }
}
