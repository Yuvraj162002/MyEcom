package com.company.models;

public class WeightBasedProduct extends  Product{

    Float minQut;
    Float pricePerKg;



    // when we make a constructor which have parameter then we use super keywords..
    public WeightBasedProduct(String name, String imageURL,float minQut,float pricePerKg) {
        super(name, imageURL);
        this.minQut = minQut;
        this.pricePerKg = pricePerKg;
    }
        @Override
        public String toString() {
            return "WeightBasedProduct{" +
                    "name='" + name + '\'' +
                    ", imageURL='" + imageURL + '\'' +
                    ", minQut=" + minQut +
                    ", pricePerKg=" + pricePerKg +
                    '}';


        //if we use default constructor then no need of super keywords...

        /*public WeightBasedProduct() {
           // super(name, imageURL);*/


    }
}
