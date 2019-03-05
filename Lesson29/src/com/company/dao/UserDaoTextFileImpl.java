package com.company.dao;

import com.company.generators.IdGenerator;
import com.company.generators.UserIdGeneratorImpl;
import com.company.models.User;

import java.io.*;
import java.util.Scanner;

public class UserDaoTextFileImpl implements UserDao {
    private String fileName;
    private IdGenerator generator;

    public UserDaoTextFileImpl() {
        this.fileName = "userdata.txt";
        generator = new UserIdGeneratorImpl();
    }

    @Override
    public User save(User model) {
        Long id = generator.nextId();
        model.setId(id);
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File(fileName), true));
            pw.println(model.getId() + " " +
                    model.getNickname() + " " +
                    model.getPassword());
            pw.close();
            return model;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File with name " +
                    fileName + " was not found");
        }
    }

    @Override
    public User find(Long id) {
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                String[] elems = s.split(" ");
                if (Long.valueOf(elems[0]).equals(id)) {
                    return new User(id, elems[1], elems[2]);
                }
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File with name " +
                    fileName + " was not found");
        }
        throw new IllegalArgumentException(
                "User with id = " + id + " was not found");
    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(Long id) {

    }
}
