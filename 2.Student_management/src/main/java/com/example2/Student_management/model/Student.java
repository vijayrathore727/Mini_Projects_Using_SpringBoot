package com.example2.Student_management.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "student_info")
public class Student {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String gender;
    private String city;
    private String state;
    private String country;
    private String courseEnrolled;
    private Boolean active;
}
