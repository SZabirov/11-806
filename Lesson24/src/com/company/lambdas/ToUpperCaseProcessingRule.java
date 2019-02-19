package com.company.lambdas;

public class ToUpperCaseProcessingRule implements TextProcessingRule {
    //заменяет все строчные буквы на заглавные в строке
    @Override
    public String process(String s) {
        char[] symbols = s.toCharArray();
        String result = "";
        for (int i = 0; i < symbols.length; i++) {
            char symbol = symbols[i];
            if (symbols[i] >= 'a' && symbols[i] <= 'z') {
                symbol = (char) (symbols[i] - 32);
            }
            result += symbol;
        }
        return result;
    }
}
