
package com.company.Assignment4_2.models;

import com.company.Assignment4_2.models.ProductType;

import java.util.List;

public class Product {

    //COMMON..
    public String name;
    public String imageURL;
    public int type;
    //WEIGHT BASED PRODUCT..
    Float minQut;
    public  Float pricePerKg;

    //VARIANT BASED PRODUCT..
    public List<Variant> Variant;

    //WB..
    public Product(String name, String imageURL, Float minQut, Float pricePerKg) {
        type = ProductType.TYPE_Weightbased;
        this.name = name;
        this.imageURL = imageURL;
        this.minQut = minQut;
        this.pricePerKg = pricePerKg;
    }
    //VB..
    public Product(String name, String imageURL,List<Variant> variant){
        type = ProductType.TYPE_Varientbased;
        this.name = name;
        this.imageURL = imageURL;
        this.Variant = variant;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        if (type == ProductType.TYPE_Weightbased)
            builder.append("Weightbased { ");
        else
            builder.append("Varientbased { ");

        builder.append("name = ").append(name);

        if (type == ProductType.TYPE_Varientbased) {
            builder.append("minQty = ").append(minQut);
            builder.append("pricePerKg = ").append(pricePerKg);
        } else {
            builder.append("Varientbased { ");
            builder.append(",variant = ").append(Variant);
        }
        builder.append(" } ");

        return builder.toString();


    }
}


