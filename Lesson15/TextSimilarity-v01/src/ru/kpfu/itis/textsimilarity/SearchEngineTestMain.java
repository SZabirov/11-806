package ru.kpfu.itis.textsimilarity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchEngineTestMain {
    public static void main(String[] args) {
        SearchEngine se = new SearchEngineImpl(new JaccardTextAnalyzer());
        TextProvider query = new SimpleTextProvider("сложная жизнь");
        TextProvider s4 = new SimpleTextProvider("some text");
        TextProvider s1 = new SimpleTextProvider("очень сложная");
        TextProvider s2 = new SimpleTextProvider("сложная очень");
        TextProvider s3 = new SimpleTextProvider("сложная жизнь прекрасна");
        List<TextProvider> sourceList = new ArrayList<>();
        sourceList.add(s1);
        sourceList.add(s2);
        sourceList.add(s3);
        sourceList.add(s4);
        List<TextProvider> results = se.getSortedByRelevanceList(query, sourceList);
        for(TextProvider tp : results) {
            System.out.println(tp);
        }

        System.out.println(new FileManager().getAllFiles(new File("somefiles")));
    }
}
