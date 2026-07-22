package com.cognizant.inventory.entity;

import jakarta.persistence.*;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String productName;

    private int quantity;

    public Inventory() {}

    public Inventory(int id,String productName,int quantity){

        this.id=id;
        this.productName=productName;
        this.quantity=quantity;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName=productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }
}