package com.example.crudAPI.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {


    @GetMapping
    public String getStudentInfo() {
        return "vsjvsf";
    }
}
