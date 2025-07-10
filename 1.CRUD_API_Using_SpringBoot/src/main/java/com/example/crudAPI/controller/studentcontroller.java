package com.example.crudAPI.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {


    @GetMapping
    public String getStudentInfo() {
        return "vsjvsf";
    }
    @PostMapping
    public String createtStudentInfo() {
        return "vsjvsf";
    }
}
