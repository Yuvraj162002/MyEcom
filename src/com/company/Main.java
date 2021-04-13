package com.company;

import com.company.models.Product;
import com.company.models.Variant;
import com.company.models.VariantsBasedProduct;
import com.company.models.WeightBasedProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /// Create products

        List<Variant> variant = new ArrayList<>(
                Arrays.asList(
                        new Variant("500gm", 50.0f),
                        new Variant("1kg", 100.0f))

        );

        Product apple = new WeightBasedProduct("Apple", "", 1, 50.0f);
        Product banana = new VariantsBasedProduct("banana", "", variant);


        /// Add them in list...
        List<Product> products = new ArrayList<>(
                Arrays.asList(apple, banana)
        );
        System.out.println(products);
    }
        //// Hashcode and equal method....

    /*    Product product1 = new Product("Apple"," ");
        Product product2 = new Product("Apple"," ");

        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());

        System.out.println(product1.equals(product2));
*/

        /// Hashcode...when we have two same string   then their value after hashcode will be same....

      /*  String a = "BA";
        String b = "BA";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
*/

        ///Varient Based Product....

       /* List<Variant>variants = new ArrayList<>(
                Arrays.asList(
                        new Variant("500gm",50.0f),
                        new Variant("1kg",100.0f),
                        new Variant("2kg",200.0f))
                );
        VariantsBasedProduct variantsBasedProduct = new VariantsBasedProduct("Apple","abv.f",variants);

        System.out.println(variantsBasedProduct);
*/

        //// Array list of product....

       /* List<Product>products = new ArrayList<>(
                Arrays.asList(
                        new Product("Apple","abc.d"),
                        new Product("kiwi","abc,.r"),
                        new Product("Banana","abc.w")
                )
        );
        System.out.println(products);
*/
        /*
        List<String> strings = new ArrayList<>(
                Arrays.asList("A", "B", "C")
        );

            // To remove anything from array we use the remove method...
                   //strings.remove("A");

        /// To check particluar value exist or not we use contains method..
              /*    if(strings.contains("D")){
                      System.out.println("yes contains");
                  }
                  else {
                      System.out.println("not contain");
                  }

        System.out.println(strings);
*/



        // Weight based product...
      /*  WeightBasedProduct product = new WeightBasedProduct("Apple","ab.cd",1,100.0f);
            System.out.println(product);
        }*/


        // When we make an  object of that constructor which have   paramters...

         /*Product product = new Product("Apple","abc");
       System.out.println(product);*/


        // When we make an  object of that constructor which have no  paramters then it give null value...

       /* Product product1 = new Product();
        System.out.println(product1);*/


        //NULL POINTER EXCEPTION---BECAUSE PRODUCT1 HAVE NO VALUE MEANS IT IS NULL SO HOW YOU CALL THE UPPERCASE..

       /* Product product1 = new Product();
        System.out.println(product1.name.toUpperCase());*/

    }

