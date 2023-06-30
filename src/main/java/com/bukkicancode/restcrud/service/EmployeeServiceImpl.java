package com.bukkicancode.restcrud.service;

import com.bukkicancode.restcrud.dao.EmployeeDAO;
import com.bukkicancode.restcrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;

    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee getStudent(int studId) {
        return employeeDAO.getStudent(studId);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        employeeDAO.save(employee);
        return employee;

    }

    @Override
    @Transactional
    public void deleteStudent(int employeeId) {
        employeeDAO.deleteStudent(employeeId);

    }
}
