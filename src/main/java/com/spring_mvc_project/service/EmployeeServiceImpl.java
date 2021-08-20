package com.spring_mvc_project.service;

import com.spring_mvc_project.dao.EmployeeDao;
import com.spring_mvc_project.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployee();
    }

    @Transactional
    @Override
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    @Transactional
    @Override
    public Employee getEmployee(int id) {
        return employeeDao.getEmployeeById(id);
    }
    @Transactional
    @Override
    public void deleteEmployee(int id) {
        employeeDao.deleteEmployeeById(id);
    }

}
