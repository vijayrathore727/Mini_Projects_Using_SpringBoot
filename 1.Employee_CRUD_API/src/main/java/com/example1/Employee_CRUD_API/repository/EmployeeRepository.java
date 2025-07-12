package com.example1.Employee_CRUD_API.repository;

import com.example1.Employee_CRUD_API.Entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
