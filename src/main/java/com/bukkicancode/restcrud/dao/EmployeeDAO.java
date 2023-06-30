package com.bukkicancode.restcrud.dao;

import com.bukkicancode.restcrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee getStudent(int employeeId);
    Employee save(Employee employee);
    void deleteStudent(int studId);
}
