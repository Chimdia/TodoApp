package com.example.todoapp.repository;

import com.example.todoapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User,Integer> {

    @Query(value = "SELECT * FROM users WHERE email = ?1" , nativeQuery = true)
    Optional<User> findUserByEmail(String email);
}
