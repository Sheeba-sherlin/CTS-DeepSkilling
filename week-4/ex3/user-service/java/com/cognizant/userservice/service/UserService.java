package com.cognizant.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cognizant.userservice.entity.User;

import com.cognizant.userservice.repository.UserRepository;

@Service
public class UserService {

    @Autowired

    private UserRepository repository;

    public List<User> getUsers(){

        return repository.findAll();

    }

}