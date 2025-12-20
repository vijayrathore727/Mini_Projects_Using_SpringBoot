package com.external.api.service;

import com.external.api.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductServiceUsingRestTemplate {

    private static final String EXTERNAL_API = "https://api.restful-api.dev/objects";

//    @Autowired
//    private RestTemplate restTemplate;
//
//    public List<Product> getAllProducts() {
//        System.out.println();
//
//        ResponseEntity<List<Product>> response =
//                restTemplate.exchange(
//                        EXTERNAL_API,
//                        HttpMethod.GET,
//                        null,
//                        new ParameterizedTypeReference<List<Product>>() {}
//                );
//
//        return response.getBody();
//    }


//    @Autowired
//    private RestTemplate restTemplate;
//
//    public List<Product> getProducts() {
//        return restTemplate.getForObject(
//                "https://api.restful-api.dev/objects",
//                List.class
//        );
//    }



    @Autowired
    private ProductClient productClient;

    public List<Product> getProducts() {
        return productClient.getProducts();
    }




    @Autowired
    private WebClient webClient;

    public List<Product> getProducts() {
        return webClient.get()
                .uri("https://api.restful-api.dev/objects")
                .retrieve()
                .bodyToFlux(Product.class)
                .collectList()
                .block();
    }






}
