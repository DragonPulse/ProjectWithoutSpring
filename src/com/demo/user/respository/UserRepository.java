package com.demo.user.respository;

import com.demo.user.domain.User;

import java.util.HashMap;
import java.util.Random;

public class UserRepository {

    private static final Random random = new Random();

    private static final HashMap<Long, User> map = new HashMap<>();

    public UserRepository() {
    }

    static {
        for (int i = 0; i < 20; i++) {
            User user = buildUser(i);
            map.put(user.getId(), user);
        }

    }

    private static User buildUser(long id) {
        User user = new User();
        user.setId(id);
        user.setName("Vijay " + random.nextLong());
        user.setAge(random.nextInt(100));
        return user;
    }

    public User load(Long id) {
        return map.get(id);
    }

}
