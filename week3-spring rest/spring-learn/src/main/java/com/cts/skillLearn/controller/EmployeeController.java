package com.cts.skillLearn.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.skillLearn.model.Employee;
import com.cts.skillLearn.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();

    }
    @DeleteMapping("/employees/{id}")
public void deleteEmployee(@PathVariable int id) {

    employeeService.deleteEmployee(id);

}

}