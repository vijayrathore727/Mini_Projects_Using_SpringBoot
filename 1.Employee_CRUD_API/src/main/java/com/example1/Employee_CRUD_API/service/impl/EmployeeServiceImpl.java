package com.example1.Employee_CRUD_API.service.impl;

import com.example1.Employee_CRUD_API.Entity.Employee;
import com.example1.Employee_CRUD_API.repository.EmployeeRepository;
import com.example1.Employee_CRUD_API.service.EmployeeService;
import org.bson.types.ObjectId;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // Create Record
    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    // Read Record
    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }
     // fatch Record By Id
    @Override
    public Optional<Employee> getById(String id) {
        return repository.findById(id);
    }

    // Update Record By Id
    @Override
    public Employee update(String id, Employee employee) {
        Employee existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        
        // Copy non-null properties from employee to existing
        BeanUtils.copyProperties(employee, existing, "id");
        
        return repository.save(existing);
    }

    // Delete Record By Id
    @Override
    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Employee not found with id: " + id);
        }
        repository.deleteById(id);
    }
}
