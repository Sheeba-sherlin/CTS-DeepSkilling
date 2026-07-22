package com.cognizant.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/gateway")

    public String gateway() {

        return "API Gateway is Running";

    }

}