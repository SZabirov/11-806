package com.company;

public class Main2 {
    public static void main(String[] args) {
//        User.Builder b = new User.Builder();
        User u = User.builder()
                .id(12L)
                .firstname("abc")
                .secondname("cde")
                .address("Kazan")
                .phoneNumber("322322")
                .build();
    }
}
