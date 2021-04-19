package com.company.Assignment4_1.Model;

public class Variant {

    public static String name;
    public Float price;
    //public static String name;
  //  String name;
   // Float price;
    //private String regex;

    public Variant(String name, Float price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s @ Rs. %.2f",name,price);

    }
}
