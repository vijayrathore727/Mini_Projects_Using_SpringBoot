package com.example1.Employee_CRUD_API.Entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "employees_info")
public class Employee {

    @Id
    private String id;
    private String name;
    private String department;
    private String city;
    private double salary;
}
