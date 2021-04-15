package com.company.Assignment4_1.models;

import java.util.List;

public class VariantsBasedProduct extends Product {

    List<Variant>Variant;


    public VariantsBasedProduct(String name, String imageURL, List<Variant> variant) {
        super(name, imageURL);
        this.Variant = variant;

    }

    @Override
    public String toString() {
        return "VariantsBasedProduct{" +
                "name='" + name + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", Variant=" + Variant +
                '}';
    }
}
