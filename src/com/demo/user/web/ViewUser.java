package com.demo.user.web;

import com.demo.user.domain.User;
import com.demo.user.service.UserService;

public class ViewUser {

    private UserService userService;


    public ViewUser(UserService userService) {
        this.userService = userService;
    }

    //UI Stuff
    public void process() {
        User user = userService.loadById(10l);
        System.out.println("user = " + user);
    }


}
