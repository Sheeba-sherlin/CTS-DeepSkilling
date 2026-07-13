package com.cts.ems.controller;

import com.cts.ems.entity.Employee;
import com.cts.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Pagination
    @GetMapping("/page/{page}/{size}")
    public Page<Employee> getEmployees(
            @PathVariable int page,
            @PathVariable int size) {

        return employeeService.getEmployees(page, size);

    }

    // Sort Ascending
    @GetMapping("/sort")
    public List<Employee> sortSalary() {

        return employeeService.sortBySalary();

    }
    @GetMapping("/projection")
public List<EmployeeProjection> getProjection() {

    return employeeService.getProjection();

}

    // Sort Descending
    @GetMapping("/sortdesc")
    public List<Employee> sortSalaryDesc() {

        return employeeService.sortBySalaryDesc();

    }

}