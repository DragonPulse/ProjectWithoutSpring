package com.demo.user.dao;

import com.demo.user.domain.User;
import com.demo.user.respository.UserRepository;

public class DefaultUserDao implements UserDao {


    private UserRepository userRepository;

    public DefaultUserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User loadById(Long id) {
        return userRepository.load(id);
    }
}
