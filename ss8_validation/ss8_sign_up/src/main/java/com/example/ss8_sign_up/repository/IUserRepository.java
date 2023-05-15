package com.example.ss8_sign_up.repository;

import com.example.ss8_sign_up.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <User,Integer> {
}
