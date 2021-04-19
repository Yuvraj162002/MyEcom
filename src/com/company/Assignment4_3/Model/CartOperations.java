package com.company.Assignment4_3.Model;


import com.company.Assignment4_1.Model.Variant;
import com.company.Assignment4_2.Model.Product;
import com.company.Assignment4_2.Model.ProductType;


import java.util.HashMap;
import java.util.Scanner;

    public class CartOperations {
        private final static Scanner scanner = new Scanner(System.in);

        public static void addItems(HashMap<String, Product> products) {
            String name;
            String imageURL;
            float qty;

            System.out.println("Enter the product name you want to add in the cart : ");
            name = scanner.next();

            if(!products.containsKey(name)){
                System.out.println("Entered product is not available");
            }
            else if(products.get(name).type == ProductType.TYPE_Varientbased){
                Cart cart = new Cart();
                System.out.println("Enter the quantity you wanted to add");
                qty = scanner.nextFloat();
                cart.add(products.get(name),qty);
                System.out.println("Your product have been successfully added");
            }
            else if(products.get(name).type == ProductType.TYPE_Weightbased){
                Cart cart = new Cart();
                int NoOfVariants=0;
                System.out.println("Choose among the following variants - ");
                for(Variant variants : products.get(name).variantList){
                    System.out.println(NoOfVariants + " : " + variants);
                    NoOfVariants++;
                }
                NoOfVariants = scanner.nextInt();
                //cart.add(products.get(name),products.get(name).variantList.get(NoOfVariants));
                System.out.println("Product added successfully in your cart..");
            }
        }

        public static void editItems(HashMap<String, Product> products) {
            String name, imageUrl;
            System.out.println("Enter the product name you want to edit : ");
            name = scanner.nextLine();
            if(!products.containsKey(name)){
                System.out.println("Product is unavailable");
            }
            else if(products.get(name).type == ProductType.TYPE_Weightbased){
                Cart cart = new Cart();
                float quantity;
                System.out.println("Enter the new quantity you want to add : ");
                quantity = scanner.nextFloat();
                cart.add(products.get(name),quantity);
            }
            else{
                Cart cart = new Cart();
                int noOfVariants = 0;
                System.out.println("Choose among the following variants : ");
                for(Variant variants : products.get(name).variantList){
                    System.out.println(noOfVariants + " : " + variants);
                    noOfVariants++;
                }
                noOfVariants = scanner.nextInt();
               // cart.add(products.get(name), products.get(name).variantList.get(noOfVariants));
                System.out.println("Your product edited successully in your cart.");

            }
        }

        public static void removeItems(HashMap<String, Product> products) {
            System.out.println("Enter the name of product you want to remove :");
            String name = scanner.nextLine();
            Cart cart = new Cart();
            cart.remove(products.get(name));
            System.out.println("Your product removed successfully from your cart.");
        }
    }

