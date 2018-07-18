package com.demo.user.factory;

import com.demo.user.TransactionProxy;
import com.demo.user.dao.DefaultUserDao;
import com.demo.user.dao.UserDao;
import com.demo.user.respository.UserRepository;
import com.demo.user.service.DefaultUserService;
import com.demo.user.service.UserService;
import com.demo.user.web.ViewUser;

import java.lang.reflect.Proxy;

public class ObjectFactory {

    public static final ObjectFactory instance = new ObjectFactory();

    private ObjectFactory() {
    }

    public UserDao userDao(UserRepository userRepository) {
        return new DefaultUserDao(userRepository);
    }
    public UserRepository userRepository() {
        return new UserRepository();
    }

    public UserService userservice(UserDao userDao) {
        return (UserService) Proxy.newProxyInstance(
                DefaultUserService.class.getClassLoader(),
                DefaultUserService.class.getInterfaces(),
                new TransactionProxy(new DefaultUserService(userDao)));
    }

    public ViewUser viewUser(UserService userservice){
        return new ViewUser(userservice);
    }
}
