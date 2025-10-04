package com.example.hospital.api.controller;

import com.example.hospital.api.entity.Patient;
import com.example.hospital.api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients") // Base URL for patients
public class PatientController {


    @Autowired
    private PatientRepository patientRepository;

    @PostMapping
    public Patient saveRecord(@RequestBody Patient patient){



       System.out.println("Hello"+patient);

        return patientRepository.save(patient);
    }
}
