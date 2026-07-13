package com.cts.ems;

import com.cts.ems.entity.Department;
import com.cts.ems.entity.Employee;
import com.cts.ems.repository.DepartmentRepository;
import com.cts.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication
        implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public static void main(String[] args) {

        SpringApplication.run(EmployeeManagementApplication.class, args);

    }

    @Override
    public void run(String... args) {

        Department department = new Department();
        department.setDepartmentName("IT");

        departmentRepository.save(department);

        Employee employee = new Employee();
        employee.setEmployeeName("Sheeba");
        employee.setEmail("sheeba@gmail.com");
        employee.setSalary(50000);
        employee.setDepartment(department);

        employeeRepository.save(employee);

        System.out.println("Employee Saved Successfully");

    }

}