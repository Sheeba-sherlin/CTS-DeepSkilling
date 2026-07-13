package com.employee;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.employee.entity.Employee;
import com.employee.util.HibernateUtil;

public class EmployeeApplication {

    public static void main(String[] args) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction transaction = session.beginTransaction();

        // CREATE
        Employee emp = new Employee(101, "Sheeba", 50000);
        session.persist(emp);

        // READ
        Employee employee = session.get(Employee.class, 101);
        System.out.println(employee.getName());

        // UPDATE
        employee.setSalary(65000);
        session.merge(employee);

        // DELETE
        // session.remove(employee);

        transaction.commit();

        session.close();

        System.out.println("CRUD Operations Completed");

    }

}