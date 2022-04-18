package com.example.emp.repository;

import com.example.emp.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> allEmployee();
    int createEmployee(Employee employee);
    int updateEmployee(Employee employee,int id);
    int deleteEmployee(int id );
    Employee employee(int id);
}
