package com.cts.skillLearn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.skillLearn.dao.EmployeeDao;
import com.cts.skillLearn.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    public ArrayList<Employee> getAllEmployees() {

        return employeeDao.getAllEmployees();

    }
    @Transactional
public void deleteEmployee(int id) {

    employeeDao.deleteEmployee(id);

}

}