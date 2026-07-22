package com.cognizant.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.cognizant.orderservice.feign.UserFeignClient;

@RestController

@RequestMapping("/orders")

public class OrderController {

    @Autowired

    private UserFeignClient client;

    @GetMapping

    public List<Object> getUsers(){

        return client.getUsers();

    }

}