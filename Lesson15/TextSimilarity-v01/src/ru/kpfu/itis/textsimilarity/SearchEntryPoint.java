package ru.kpfu.itis.textsimilarity;

import java.io.File;
import java.util.List;

public class SearchEntryPoint {
    FileManager manager = new FileManager();
    SearchEngine se;

    void printResults(String text, String folderPath) {
        TextProvider tp = new SimpleTextProvider(text);
        File f = new File(folderPath);
        List<File> filesFromFolder = manager.getAllFiles(f);

    }
}
