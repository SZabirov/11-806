package ru.kpfu.itis.textsimilarity;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
    private static final String FILE_NAME = "log.txt";
    private PrintWriter printWriter;

    public Logger() {
        try {
            FileWriter fw = new FileWriter(FILE_NAME);
            this.printWriter = new PrintWriter(fw, true);
        } catch (IOException e) {
            throw new IllegalArgumentException("Logger не создан. Всё пропало :(");
        }
    }

    void info(String message) {
        printWriter.println("INFO " + LocalDateTime.now() +
                " " + message);
    }

    void error(String message) {
        printWriter.println("ERROR " + LocalDateTime.now() +
                " " + message);
    }
}
