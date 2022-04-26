package com.example.emp.repository;
import com.example.emp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> allEmployees(){
        return employeeRepository.allEmployee();
    }

    public Employee employee(int id){
        return employeeRepository.employee(id);
    }
    public int createEmployee(Employee employee){
        return employeeRepository.createEmployee(employee);
    }

    public int updateEmployee(Employee employee,int id){
        return employeeRepository.updateEmployee(employee,id);
    }
    public int deleteEmployee(int id){
        return employeeRepository.deleteEmployee(id);
    }
}
