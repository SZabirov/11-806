package ru.kpfu.itis.textsimilarity;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer a = new JaccardTextAnalyzer();
        String s1 = "Мама мыла раму, а я ничего не делал";
        String s2 = "Я совсем ничего не делал";
        double coef = a.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
        System.out.println("Коэффициент схожести по Джакарду: " + coef);
    }
}
