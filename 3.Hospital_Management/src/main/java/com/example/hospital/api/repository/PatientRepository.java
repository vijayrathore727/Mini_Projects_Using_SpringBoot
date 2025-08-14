package com.example.hospital.api.repository;

import com.example.hospital.api.entity.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {

    // Hello i'm Indore
}
