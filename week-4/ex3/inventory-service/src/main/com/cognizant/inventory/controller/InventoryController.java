package com.cognizant.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.cognizant.inventory.entity.Inventory;

import com.cognizant.inventory.service.InventoryService;

@RestController

@RequestMapping("/inventory")

public class InventoryController {

    @Autowired

    private InventoryService service;

    @GetMapping

    public List<Inventory> getInventory(){

        return service.getInventory();

    }

}