package com.cognizant.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.cognizant.userservice.entity.User;

import com.cognizant.userservice.service.UserService;

@RestController

@RequestMapping("/users")

public class UserController {

    @Autowired

    private UserService service;

    @GetMapping

    public List<User> getUsers(){

        return service.getUsers();

    }

}