package com.cognizant.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt.model.LoginRequest;
import com.cognizant.jwt.security.JwtTokenProvider;

@RestController
public class AuthController {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @PostMapping("/login")
    public String login(
            @RequestBody LoginRequest request) {

        return jwtTokenProvider.generateToken(
                request.getUsername());

    }

}