package com.example1.Employee_CRUD_API.controller;

import com.example1.Employee_CRUD_API.Entity.Employee;
import com.example1.Employee_CRUD_API.response.ApiResponse;
import com.example1.Employee_CRUD_API.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {


    // this is jaya branch
    @Autowired
    private EmployeeService service;

    @PostMapping
    public ResponseEntity<ApiResponse<Employee>> create(@RequestBody Employee employee) {
        System.out.println(employee);
        Employee saved = service.create(employee);
        return ResponseEntity.ok(new ApiResponse<>(200, "Employee created", saved));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Employee>>> getAll() {
        return ResponseEntity.ok(new ApiResponse<>(200, "All employees", service.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Employee>> getById(@PathVariable String  id) {
        return service.getById(id)
                .map(emp -> ResponseEntity.ok(new ApiResponse<>(200, "Employee found", emp)))
                .orElse(ResponseEntity.status(404).body(new ApiResponse<>(404, "Employee not found", null)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Employee>> update(@PathVariable String id, @RequestBody Employee employee) {
        Employee updated = service.update(id, employee);
        return ResponseEntity.ok(new ApiResponse<>(200, "Employee updated", updated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.ok(new ApiResponse<>(200, "Employee deleted", "Deleted ID: " + id));
    }
}
