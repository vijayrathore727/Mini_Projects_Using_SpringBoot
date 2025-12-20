package com.external.api.model;

import lombok.Data;

import java.util.Map;


@Data
public class Product {
    private String id;
    private String name;
    private Map<String, Object> data;
}
