package ru.kpfu.itis.textsimilarity;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

//пример синглтона
//В системе будет присутствовать единственный экземпляр BetterLogger'a
public class BetterLogger {
    private static BetterLogger instance;
    private static final String FILE_NAME = "log.txt";
    private PrintWriter printWriter;

    public static BetterLogger getInstance() {
        if (instance == null) {
            instance = new BetterLogger();
        }
        return instance;
    }

    private BetterLogger() {
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
