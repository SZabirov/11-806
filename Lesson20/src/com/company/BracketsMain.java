package com.company;

import java.util.Scanner;

public class BracketsMain {
    public static void main(String[] args) {
        //{[(7+5)*3+7]-10}/7
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean b = bracketsAreCorrect(str);
        System.out.println(b);
    }

    static boolean bracketsAreCorrect(String s) {
        Stack stack = new Stack(s.length());
        char[] symbols = s.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            char c = symbols[i];
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (c == ')' || c == ']' || c == '}') {
                    if (!stack.isEmpty()) {
                        char bracketFromStack = stack.pop();
                        if (c == ')' && bracketFromStack != '(') {
                            return false;
                        }
                        if (c == '}' && bracketFromStack != '{') {
                            return false;
                        }
                        if (c == ']' && bracketFromStack != '[') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}












