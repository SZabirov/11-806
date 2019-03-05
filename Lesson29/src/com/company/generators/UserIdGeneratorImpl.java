package com.company.generators;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserIdGeneratorImpl implements IdGenerator {
    String idGeneratorFileName = "id_generator.txt";

    @Override
    public Long nextId() {
        try {
            Scanner sc = new Scanner(new File(idGeneratorFileName));
            Long id = sc.nextLong();
            sc.close();
            PrintWriter pw = new PrintWriter(new File(idGeneratorFileName));
            pw.println(id + 1);
            pw.close();
            return id;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("id generator file with name = " + idGeneratorFileName + " not found");
        }
    }
}
