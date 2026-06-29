package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.User;
import com.cts.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user) {

        return repository.save(user);

    }

    public User getUser(Long id) {

        return repository.findById(id).orElse(null);

    }

}