package com.example.ss8_sign_up.service;

import com.example.ss8_sign_up.model.User;

import java.util.List;

public interface IUserService {
    List<User> display();
    void save(User user);
}
