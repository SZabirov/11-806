package ru.kpfu.itis.exceptionsexcerpts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainOutOfMemoryErrorExample {
    public static void main(String[] args) {
        int[] arr = new int[Integer.MAX_VALUE];
    }
}

class MainOutOfMemoryErrorExampleTryCatch {
    public static void main(String[] args) {
        int[] arr = null;
        try {
            arr = new int[Integer.MAX_VALUE];
        } catch (Error e) {
            System.out.println("Всё очень плохо");
        }
        System.out.println(arr[0]);//в конечном счете обработка Error'ов почти никогда не производится по причине неопределенного состояния приложения после выбрасывания Error'a
    }
}
