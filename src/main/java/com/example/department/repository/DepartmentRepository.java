package com.example.department.repository;

import com.example.department.model.Department;

import java.util.List;

public interface DepartmentRepository {

    List<Department> allDepartments();

    int createDepartment(Department department);

    int updateDepartment(Department department,int id);

    int deleteDepartment(int id);

    Department department(int id);
}
