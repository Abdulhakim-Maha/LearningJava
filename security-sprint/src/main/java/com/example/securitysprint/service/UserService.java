package com.example.securitysprint.service;

import com.example.securitysprint.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User getUser(String username);

    List<User> getUser();

}
