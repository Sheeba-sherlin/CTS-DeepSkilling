package com.cts.service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.cts.entity.User;

@Service
public class UserService {

    public User getUserById(Long id) {

        throw new NoSuchElementException("User not found");

    }

}