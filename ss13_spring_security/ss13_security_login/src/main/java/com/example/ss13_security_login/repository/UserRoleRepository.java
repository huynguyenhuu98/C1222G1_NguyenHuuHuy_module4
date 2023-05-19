package com.example.ss13_security_login.repository;

import com.example.ss13_security_login.entity.AppUser;
import com.example.ss13_security_login.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
