package com.example.emp.model;

import com.example.department.model.Department;

public class Employee {
    private int id;
    private String name;

    private  String email;

    private String mobile;

    private String location;

    private int department_id;

    private Department department;
    public Employee(){

    }

    public  Employee(int id,String name,String email,String mobile,String location,int department_id){
        this.id=id;
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.location=location;
        this.department_id=department_id;

    }

    public Employee(String name, String email,String mobile,String location,int department_id) {
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.location=location;
        this.department_id=department_id;

    }



    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", location=" + location +
                ", department_id=" + department_id +
                '}';
    }

}
