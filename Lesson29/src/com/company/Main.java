package com.company;

import com.company.models.User;
import com.company.services.UserService;
import com.company.services.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите логин");
        String username = sc.nextLine();
        System.out.println("введите пароль");
        String password = sc.nextLine();
        User u = new User();
        u.setNickname(username);
        u.setPassword(password);
        UserService service = new UserServiceImpl();
        User createdUser = service.signUp(u);
        System.out.println(createdUser);
    }
}
