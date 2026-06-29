package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cts.entity.User;
import com.cts.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User saveUser(@RequestBody User user) {

        return service.saveUser(user);

    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {

        return service.getUser(id);

    }

}