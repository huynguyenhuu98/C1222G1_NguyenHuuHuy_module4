package com.example.ss13_security_login.repository;


import com.example.ss13_security_login.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String userName);
}