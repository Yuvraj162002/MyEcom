package com.company.Assignment4_3.Model;

import com.company.Assignment4_1.Model.Product;
import com.company.Assignment4_1.Model.Variant;
import com.company.Assignment4_2.Model.CartItem;
import com.company.Assignment4_2.Model.ProductType;

import java.util.HashMap;


    public class Cart {

        public HashMap<String, CartItem> cartItem = new HashMap<>();
        public Float total;
        public Float noOfItems;

        //Weight based product..
        public void add(Product product, float qty) {
            //If product already present in the cart..
            if (cartItem.containsKey(product.name)) {

                total -= cartItem.get(product.name).cost();
                cartItem.get(product.name).qty = qty;
            }
            //Adding for the first time..
            else {
                CartItem item = new CartItem(product.name, product.pricePerKg, qty);
                cartItem.put(product.name, item);
                noOfItems++;
            }

            //Update cart summary..
            total += product.pricePerKg * qty;
        }

        //Variant based product..
        public void add(Product product, Variant variant) {
            String key = product.name + " " + Variant.name;

            //If product already present in the cart..
            if (cartItem.containsKey(key)) {
                cartItem.get(key).qty++;
            }

            //Adding for the first time..
            else {


                CartItem item = new CartItem(product.name, variant.price, 1F);
                cartItem.put(key, item);
            }

            //Update cart summary..
            noOfItems++;
            total += variant.price;
        }


        ///Removing  product..
        public void remove(Product product) {
            if (product.type == ProductType.TYPE_Weightbased) {
                removeWeightBasedProduct(product);
            } else {
                removeAllVariantBasedProduct(product);
            }
        }

        ///Removing Weight based product...
        private void removeWeightBasedProduct(Product product) {
            ///Update cartSummary...
            total -= cartItem.get(product.name).cost();
            noOfItems--;
            CartItem remove = cartItem.remove(product.name);
        }


        ///Removing all  variant of Variant based product..
        public void removeAllVariantBasedProduct(Product product) {
            for (Variant variant : product.Variant) {
                String key = product.name + " " + Variant.name;

                if (cartItem.containsKey(key)) {
                    ///Update cartSummary...
                    total -= cartItem.get(key).cost();
                    noOfItems -= cartItem.get(key).qty;

                    cartItem.remove(key);

                }


            }
        }

        //decrement qty..
        public void decrement(Product product, Variant variant) {
            String key = product.name + " " + Variant.name;


            //Update qty..
            cartItem.get(key).qty--;

            ///Update cartSummary...
            total -= variant.price;
            noOfItems --;

            ///Remove if qty = 0..
            if (cartItem.get(key).qty == 0){
                cartItem.remove(key);

            }
        }

        @Override
        public String toString() {
            return "Cart{" +
                    "cartItem=" + cartItem +
                    ", total=" + total +
                    ", noOfItems=" + noOfItems +
                    '}';
        }

        public void remove(com.company.Assignment4_2.Model.Product product) {
        }

        public void removeAllVariantBasedProduct(com.company.Assignment4_2.Model.Product product) {
        }

        public void add(com.company.Assignment4_2.Model.Product product, float quantity) {
        }

        // public void remove(com.company.Assignment4_2.Model.Product product) {
        //  }

        //public void add(com.company.Assignment4_2.Model.Product product, float quantity) {
        //}

        //public void add(com.company.Assignment4_2.Model.Product product, com.company.Assignment4_2.Model.Variant variant) {
//    }
    }

