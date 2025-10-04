package com.example.hospital.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "patients")
@Data // generates getters, setters, toString, equals, hashCode
@NoArgsConstructor // generates no-arg constructor (needed by Jackson)
@AllArgsConstructor // generates all-arg constructor
public class Patient {

    @Id
    private String id;
    private String name;
    private LocalDate birthDate;
    private String email;



}
