package com.demo.user.service;

import com.demo.user.dao.UserDao;
import com.demo.user.domain.User;

public class DefaultUserService implements UserService {

    private final UserDao userDao ;

    public DefaultUserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User loadById(Long id) {
        return userDao.loadById(id);
    }
}
