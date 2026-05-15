package com.java.oop;

public class Main {
    static void main(String[] args) {

        Product product;
        product = new Product();

        product.id = 1;
        product.name = "Acer";
        product.discountPercentage = 14.5f;
        product.rating = 3.5f;
        product.maxRetailPrice = 550000;
        product.isAvailable = true;




        System.out.println("Id: "+product.id);
        System.out.println("Name: "+product.name);
        System.out.println("MRP: "+product.maxRetailPrice);
        System.out.println("Discount Percentage: "+product.discountPercentage);
        System.out.println("Rating: "+product.rating);
        System.out.println("Available: "+product.isAvailable);



    }
}
