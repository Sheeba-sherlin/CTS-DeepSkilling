package com.cognizant.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.inventory.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory,Integer>{

}