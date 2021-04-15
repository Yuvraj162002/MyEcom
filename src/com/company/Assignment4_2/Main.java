package com.company.Assignment4_2;

import com.company.Assignment4_1.models.Variant;
import com.company.Assignment4_2.models.Cart;
import com.company.Assignment4_1.models.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Product product = new Product("Apple","");
        Product orange = new Product("Orange","");
        Product kiwi = new Product("kiwi","",new ArrayList<>(
                                Arrays.asList(
                                        new Variant("500gm",50.0f),
                                        new Variant("1kg",100.0f)
                                )));
        Product surfExcel = new Product("surfExcel","",new ArrayList<>(
                                        Arrays.asList(
                                                new Variant("1kg",100.0f))));

        Cart cart = new Cart();
        cart.add(orange,2.5f);
        cart.add(kiwi,kiwi.Variant.get(1));
        cart.add(kiwi,kiwi.Variant.get(1));
        cart.add(kiwi,kiwi.Variant.get(1));
        cart.add(surfExcel,surfExcel.Variant.get(0));
        cart.add(surfExcel,surfExcel.Variant.get(0));

        System.out.println(cart);

        cart.remove(orange);
        System.out.println();
        System.out.println(cart);


        cart.decrement(surfExcel,surfExcel.Variant.get(0));
        System.out.println();
        System.out.println(cart);

        cart.decrement(surfExcel,surfExcel.Variant.get(0));
        System.out.println();
        System.out.println(cart);
    }
}
