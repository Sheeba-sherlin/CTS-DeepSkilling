package com.cts.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.User;
import com.cts.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getUserById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new NoSuchElementException("User not found"));

    }

}