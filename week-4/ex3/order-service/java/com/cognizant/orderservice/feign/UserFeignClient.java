package com.cognizant.orderservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="user-service",url="http://localhost:8081")

public interface UserFeignClient {

    @GetMapping("/users")

    List<Object> getUsers();

}