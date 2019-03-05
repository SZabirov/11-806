package com.company.services;

import com.company.models.User;

public interface UserService {
    //регистрирует нового пользователя и возвращает юзера с заполненным полями
    User signUp(User user);

    User signIn(User user);
}
