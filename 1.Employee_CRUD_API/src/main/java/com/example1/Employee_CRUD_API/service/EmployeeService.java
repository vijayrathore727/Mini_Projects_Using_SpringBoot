package com.example1.Employee_CRUD_API.service;

import com.example1.Employee_CRUD_API.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee create(Employee employee);
    List<Employee> getAll();
    Optional<Employee> getById(String id);
    Employee update(String id, Employee employee);
    void delete(String id);
}
