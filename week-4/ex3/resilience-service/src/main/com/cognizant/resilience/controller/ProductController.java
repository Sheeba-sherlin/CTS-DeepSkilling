package com.cognizant.resilience.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cognizant.resilience.service.ProductService;

@RestController
public class ProductController {

    @Autowired

    private ProductService productService;

    @GetMapping("/product")

    public String getProduct() {

        return productService.getProduct();

    }

}