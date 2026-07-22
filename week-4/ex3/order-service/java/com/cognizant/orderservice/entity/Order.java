package com.cognizant.orderservice.entity;

public class Order {

    private int orderId;

    private int userId;

    private String product;

    public Order(){

    }

    public Order(int orderId,int userId,String product){

        this.orderId=orderId;
        this.userId=userId;
        this.product=product;

    }

    public int getOrderId(){
        return orderId;
    }

    public void setOrderId(int orderId){
        this.orderId=orderId;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId=userId;
    }

    public String getProduct(){
        return product;
    }

    public void setProduct(String product){
        this.product=product;
    }

}