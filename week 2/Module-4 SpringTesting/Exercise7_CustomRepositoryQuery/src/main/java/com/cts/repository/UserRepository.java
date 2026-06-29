package com.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByName(String name);

}