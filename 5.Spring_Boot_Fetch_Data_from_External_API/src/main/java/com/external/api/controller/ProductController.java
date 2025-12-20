package com.external.api.controller;

import com.external.api.model.Product;
import com.external.api.service.ProductServiceUsingRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServiceUsingRestTemplate productService;

    @GetMapping("/products")
    public List<Product> fetchProducts() {
        return productService.getAllProducts();
    }

}
