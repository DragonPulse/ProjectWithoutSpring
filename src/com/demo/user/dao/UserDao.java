package com.demo.user.dao;

import com.demo.user.domain.User;

public interface UserDao {

    User loadById(Long id);
}
