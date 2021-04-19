package com.company.Assignment4_2.Model;

public class CartItem {

    public  String name;
    Float UnitPerPrice;
    public Float qty;

    public CartItem(String name, Float unitPerPrice, Float qty) {
        this.name = name;
        this.UnitPerPrice = unitPerPrice;
        this.qty = qty;
    }

    public  Float cost(){
        return UnitPerPrice * qty;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "name='" + name + '\'' +
                String.format("\n,cost= %f X %f = %f",UnitPerPrice,qty,cost())
                +'}';
    }
}
