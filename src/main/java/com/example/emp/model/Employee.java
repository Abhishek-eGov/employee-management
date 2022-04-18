package com.example.emp.model;

public class Employee {
    private int id;
    private String name;
    private  String email;

    private String mobile;

    private String location;
    public Employee(){

    }

    public  Employee(int id,String name,String email,String mobile,String location){
        this.id=id;
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.location=location;

    }

    public Employee(String name, String email,String mobile,String location) {
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.location=location;

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", location=" + location +
                '}';
    }

}
