package com.java.oop.assignment;

import java.io.IOException;

public class Main {



    public static void main(String[] args) throws IOException {
        CsvReader csvReader = new CsvReader();

        
        ProductService productService = new ProductService(csvReader);
        System.out.println(productService.getAllProducts());
        Product product = new Product();
        product.setId(51);
        product.setName("Samsung TV");
        product.setMaxRetailPrice(32432);
        product.setDiscountPercentage(10);
        product.setAvailable(true);
        product.setCompany("Samsung");
        product.setCategory("TV");
        product.setManufacturedYear(2023);
        productService.addProduct(product);
        //System.out.println(productService.getAllProducts());
        productService.addProduct(product);
        System.out.println(productService.getAllProducts());

    }
}
