package com.example.letsLearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.letsLearn.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
