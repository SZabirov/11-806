package ru.kpfu.itis.textsimilarity;

public class SimpleTextProvider implements TextProvider {
    private static final int MAX_TO_STRING_NUM = 100;
    private String text;

    public SimpleTextProvider(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        String strToReturn;
        if (text.length() > MAX_TO_STRING_NUM) {
            strToReturn = text.substring(0, MAX_TO_STRING_NUM - 1);
        } else {
            strToReturn = text;
        }
        return "SimpleTextProvider{" +
                "text='" + strToReturn + '\'' +
                '}';
    }
}
