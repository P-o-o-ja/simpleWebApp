package com.example.simpleWebApp.controller;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
        @Autowired
        ProductService service;

        @GetMapping("/products")
        public List<Product> getProduct(){
            return service.getProducts();
        }

        @GetMapping ("/products/{productId}")
        public Product getOneProduct(@PathVariable int productId){
                return service.getProductsById(productId);
        }

        @PostMapping ("/products")
        public void addProduct(@RequestBody Product prod){
                service.addProduct(prod);
        }
        @PutMapping ("/products")
        public void updateProduct(@RequestBody Product prod){
                service.updateProduct(prod);
        }

        @DeleteMapping("/products/{productId}")
        public void deleteProduct(@PathVariable int productId){
                service.deleteProduct(productId);
        }
}
