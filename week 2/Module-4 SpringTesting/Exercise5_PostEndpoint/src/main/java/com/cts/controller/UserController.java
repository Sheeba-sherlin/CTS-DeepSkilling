package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.cts.entity.User;

import com.cts.service.UserService;

@RestController

@RequestMapping("/users")

public class UserController {

    @Autowired

    private UserService userService;

    @PostMapping

    public ResponseEntity<User> createUser(@RequestBody User user){

        return ResponseEntity.ok(

                userService.saveUser(user)

        );

    }

}