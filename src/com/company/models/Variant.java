package com.company.models;

public class Variant {

    String name;
    Float price;
    //private String regex;

    public Variant(String name, Float price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s @ Rs. %f",name,price);

    }
}
