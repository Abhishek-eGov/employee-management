package com.example.emp.repository;

import com.example.emp.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeImpl implements EmployeeRepository {

    private JdbcTemplate jdbcTemplate;

    public EmployeeImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public List<Employee> allEmployee() {
        var sql= "SELECT * from employee";
        return jdbcTemplate.query(sql,new EmployeeRowMapper()) ;
    }

    @Override
    public int createEmployee(Employee employee) {
        var sql ="INSERT INTO employee(name,email,mobile,location) VALUES(?,?,?,?)";
        return jdbcTemplate.update(sql,new Object[]{employee.getName(),employee.getEmail(),employee.getMobile(),employee.getLocation()
        });
    }

    @Override
    public int updateEmployee(Employee employee, int id) {
        var sql="UPDATE employee set name=?,email=?,mobile=?,location=? WHERE id=?";
        return jdbcTemplate.update(sql,employee.getName(),employee.getEmail(),employee.getMobile(),employee.getLocation(),id);
    }

    @Override
    public int deleteEmployee(int id) {
        var sql ="DELETE FROM employee WHERE id=?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public Employee employee(int id) {
        var sql	 = "SELECT * FROM employee WHERE id =?";
        return jdbcTemplate.queryForObject(sql,new EmployeeRowMapper(),id);
    }
}
