package com.external.api.service;

import com.external.api.model.Product;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;



@FeignClient(name = "productClient", url = "https://api.restful-api.dev")
public interface ProductClient {

    @GetMapping("/objects")
    List<Product> getProducts();
}


