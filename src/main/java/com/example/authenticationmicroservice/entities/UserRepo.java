package com.example.authenticationmicroservice.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    public User findUserByEmail(String email);
    public User findUserById(Long id);
}
