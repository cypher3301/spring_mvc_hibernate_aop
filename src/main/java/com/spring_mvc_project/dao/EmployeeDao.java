package com.spring_mvc_project.dao;

import com.spring_mvc_project.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int id);


    public void deleteEmployeeById(int id);
}
