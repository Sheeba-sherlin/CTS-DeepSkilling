package com.cognizant.resilience.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import io.github.resilience4j.retry.annotation.Retry;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @CircuitBreaker(name = "productService",
            fallbackMethod = "fallbackProduct")

    @Retry(name = "productService")

    public String getProduct() {

        throw new RuntimeException("Product Service Down");

    }

    public String fallbackProduct(Exception ex) {

        return "Fallback Response : Product Service is unavailable.";

    }

}