package com.demo.user;

import com.demo.user.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TransactionProxy implements InvocationHandler {

    private UserService userService;

    public TransactionProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            beginTransaction();
            Object result = method.invoke(userService, args);
            commitTransaction();
            return result;
        }catch (Exception e) {
            rollbackTransaction();
        }
        return null;
    }

    public void beginTransaction() {

        System.out.println("Begin Transaction");
    }
    public void commitTransaction() {

        System.out.println("Commit Transaction");
    }

    public void rollbackTransaction() {

        System.out.println("rollback Transaction");
    }
}
