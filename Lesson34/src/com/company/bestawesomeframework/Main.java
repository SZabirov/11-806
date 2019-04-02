package com.company.bestawesomeframework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SimpleStudent> list =
                SuperBestAwesomeFramework.getMany(SimpleStudent.class, 100);
        System.out.println(list);
    }
}
