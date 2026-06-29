package com.cts.service;

import org.springframework.stereotype.Service;

import com.cts.entity.User;

@Service
public class UserService {

    public User getUserById(Long id) {

        return new User(id, "Sheeba");

    }

}