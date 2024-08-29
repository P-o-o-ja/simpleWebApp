package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product>product= new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000),
//                                       new Product(102, "Camera", 10000),
//                                       new Product(103, "Laptop", 60000)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductsById(int productId) {
        return repo.findById(productId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }
}