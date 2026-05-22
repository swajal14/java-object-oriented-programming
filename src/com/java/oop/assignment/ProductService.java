package com.java.oop.assignment;

import java.io.IOException;
import java.util.List;

public class ProductService {

    private List<Product> products;
    private CsvReader csvReader;

    public ProductService(CsvReader csvReader) throws IOException {
        this.csvReader = csvReader;
        products = this.csvReader.getProductsFromCsv();
    }

    /*
    CRUD
    Create -> new Product
    REad -> existing product read
        -> existing all products
    Update -> existing product update
    Delete -> existing product delete
     */

    public List<Product> getAllProducts(){
        return products ;
    }
    public Product  addProduct(Product  product){
        products.add(product);
        return product;
    }
    public Product getProductById(int id){
        Product getProductById = null;
        for(Product product : products){
            if(product.getId() == id){
                getProductById = product;
            }
        }
        return getProductById;
    }

    public Product updateProduct(Product product){
        int index = 0;
        for(Product p : products){
            if(p.getId() == product.getId()){
                products.set(index, product);
                return product;
            }
            index++;
        }
        return null;

    }

}
