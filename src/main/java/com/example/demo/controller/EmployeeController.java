package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService ;
    public EmployeeController (EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.createEmployee(employee));
    }

    @PutMapping
    public ResponseEntity<EmployeeService> updateEmployeee(@PathVariable Long id , @RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.updateEmployee(id , employee));
    }

    @DeleteMapping("/{id")
    public RequestEntity<Employee> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
