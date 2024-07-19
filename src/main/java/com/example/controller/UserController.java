package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;

public class UserController {
    private UserService userService = new UserService();

    public void createUser(String id, String name, String email) {
        User user = new User(id, name, email);
        userService.addUser(user);
    }

    public User getUser(String id) {
        return userService.getUser(id);
    }
}
