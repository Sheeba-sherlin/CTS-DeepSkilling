package com.cognizant.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cognizant.inventory.entity.Inventory;

import com.cognizant.inventory.repository.InventoryRepository;

@Service
public class InventoryService {

    @Autowired

    private InventoryRepository repository;

    public List<Inventory> getInventory(){

        return repository.findAll();

    }

}