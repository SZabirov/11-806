package com.company.services;

import com.company.dao.UserDao;
import com.company.dao.UserDaoTextFileImpl;
import com.company.models.User;

public class UserServiceImpl implements UserService {
    UserDao userDao;

    public UserServiceImpl() {
        this.userDao = new UserDaoTextFileImpl();
    }

    @Override
    public User signUp(User user) {
        if (user.getPassword().length() < 8) {
            throw new IllegalArgumentException("Password can not be shorter than 8 symbols");
        }
        User u = userDao.save(user);
        return u;
    }
}
