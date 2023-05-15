package com.example.ss8_sign_up.service.impl;

import com.example.ss8_sign_up.model.User;
import com.example.ss8_sign_up.repository.IUserRepository;
import com.example.ss8_sign_up.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public List<User> display() {
        return iUserRepository.findAll();
    }

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }
}
