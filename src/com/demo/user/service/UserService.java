package com.demo.user.service;

import com.demo.user.domain.User;

public interface UserService {

    User loadById(Long id);
}
