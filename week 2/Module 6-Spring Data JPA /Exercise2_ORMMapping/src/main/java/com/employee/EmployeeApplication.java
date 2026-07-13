package com.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

    private final EmployeeRepository repository;

    public EmployeeApplication(EmployeeRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Employee emp = new Employee("Sheeba", 60000);

        repository.save(emp);

        System.out.println("Employee Saved Successfully");

    }
}