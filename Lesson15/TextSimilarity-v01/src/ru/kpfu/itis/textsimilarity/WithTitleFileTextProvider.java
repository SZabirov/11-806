package ru.kpfu.itis.textsimilarity;

import java.io.File;
//использование паттерна декоратор
public class WithTitleFileTextProvider implements TextProvider {
    private TextProvider fileTextProvider;
    private File file;

    //конструктор для динамического декорирования имеющегося FileTextProvider'a
    public WithTitleFileTextProvider(FileTextProvider ftp) {
        this.fileTextProvider = ftp;
        this.file = ftp.getInput();
    }

    public WithTitleFileTextProvider(File f) {
        this.file = f;
        fileTextProvider = new FileTextProvider(f);
    }

    @Override
    public String getText() {
        return file.getName() + " " + fileTextProvider.getText();
    }
}
