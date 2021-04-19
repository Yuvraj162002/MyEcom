package com.company.Assignment4_3.Model;
//package Assignment_4_2_2.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import com.company.Assignment4_1.Model.Variant;
import com.company.Assignment4_2.Model.Product;

public class ProductOperations {
    private final static Scanner scanner = new Scanner(System.in);

    public static void addProduct(HashMap<String, Product> products) {


        System.out.println("Select type of product to perform operation..");
        System.out.println("\n1. Add Weight Based Product");
        System.out.println("\n2. Add Variant Based Product");
        System.out.println("\n1. Go Back ");

        int choose = scanner.nextInt();

        switch (choose) {

            case 1:
                addWeightBasedProduct(products);
                break;

            case 2:
                addVariantBasedProduct(products);
                break;

            case 3:
                System.out.println("Back to main page");
                break;

            default:
                System.out.println("ERROR!! You choose invalid operation.");
        }
    }

    private static void addVariantBasedProduct(HashMap<String, Product> products) {

        List<Variant> variants = new ArrayList<>();
        System.out.println("Enter name of product :");
        String name = scanner.nextLine();
        System.out.println("Enter image Url of product :");
        String imageUrl = scanner.nextLine();
        System.out.println("Enter price per Kg of product :");
        float pricePerKg = scanner.nextFloat();
        System.out.println("Enter number of variants :");
        int noOfVariants = scanner.nextInt();

        for(int i = 0;i < noOfVariants; i++) {
            String amount = scanner.next();
            float price = scanner.nextFloat();

            Variant var = new Variant(amount, price);
            variants.add(var);
        }
        String key = name;
        Product product = new Product(name, imageUrl, variants);
        System.out.println("Done! Product added successfully.");
    }

    private static void addWeightBasedProduct(HashMap<String, Product> products) {
        System.out.println("Enter name of product :");
        String name = scanner.nextLine();
        System.out.println("Enter image Url of product :");
        String imageUrl = scanner.nextLine();
        System.out.println("Enter price per Kg of product :");
        float pricePerKg = scanner.nextFloat();
        System.out.println("Enter minimum quantity of product :");
        float minQuantity = scanner.nextFloat();

        Product product = new Product(name, imageUrl, pricePerKg, minQuantity);
        products.put(name, product);

        System.out.println("Done! Product added successfully.");
    }


    public static void editProduct(HashMap<String, Product> products) {
        System.out.println("Select type of product to perform operation..");
        System.out.println("\n1. Edit Weight Based Product");
        System.out.println("\n2. Edit Variant Based Product");
        System.out.println("\n3. Go Back");

        int choose = scanner.nextInt();

        switch (choose) {

            case 1:
                editWeightBasedProduct(products);

                break;

            case 2:
                editVariantBasedProduct(products);
                break;

            case 3:
                System.out.println("Back to main page");
                break;

            default:
                System.out.println("ERROR!! You choose invalid operation.");
        }

    }

    private static void editVariantBasedProduct(HashMap<String, Product> products) {
        List<Variant> variants = new ArrayList<>();
        System.out.println("Enter new name of product :");
        String name = scanner.nextLine();
        System.out.println("Enter new image Url of product :");
        String imageUrl = scanner.nextLine();
        System.out.println("Enter new price per Kg of product :");
        float pricePerKg = scanner.nextFloat();
        System.out.println("Enter new number of variants :");
        int noOfVariants = scanner.nextInt();

        for(int i = 0;i < noOfVariants; i++) {
            String amount = scanner.next();
            float price = scanner.nextFloat();

            Variant var = new Variant(amount, price);
            variants.add(var);
        }
        String key = name;
        Product product = new Product(name, imageUrl, variants);
        System.out.println("Done! Product edited successfully.");
    }

    private static void editWeightBasedProduct(HashMap<String, Product> products) {
        System.out.println("Enter name of product which you want to edit :");
        String name = scanner.nextLine();
        System.out.println("Enter new image Url of product :");
        String imageUrl = scanner.nextLine();
        System.out.println("Enter new price per Kg of product :");
        float pricePerKg = scanner.nextFloat();
        System.out.println("Enter  new minimum quantity of product :");
        float minQuantity = scanner.nextFloat();

        Product product = new Product(name, imageUrl, pricePerKg, minQuantity);
        products.put(name, product);

        System.out.println("Done! Product edited successfully.");

    }

    public static void deleteProduct(HashMap<String, Product> products) {
        System.out.println("Select type of product to perform operation..");
        System.out.println("\n1. Delete Weight Based Product");
        System.out.println("\n2. Delete Variant Based Product");
        System.out.println("\n1. Go Back ");

        int choose = scanner.nextInt();

        switch (choose) {

            case 1:
                deleteWeightBasedProduct(products);
                break;

            case 2:
                deleteVariantBasedProduct(products);
                break;

            case 3:
                System.out.println("Back to main page");
                break;

            default:
                System.out.println("ERROR!! You choose invalid operation.");
        }

    }

    private static void deleteVariantBasedProduct(HashMap<String, Product> products) {
        System.out.println("Enter the name of product you want to delete :");
        String name = scanner.nextLine();
        Cart cart = new Cart();
        cart.removeAllVariantBasedProduct(products.get(name));
        System.out.println("Your product have been successfully removed.");

    }

    private static void deleteWeightBasedProduct(HashMap<String, Product> products) {
        System.out.println("Enter the name of product you want to delete :");
        String name = scanner.nextLine();
        Cart cart = new Cart();
        cart.remove(products.get(name));
        System.out.println("Your product have been successfully deleted.");
    }


}




