package com.bukkicancode.restcrud.service;

import com.bukkicancode.restcrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee getStudent(int employeeId);
    Employee save(Employee employee);
    void deleteStudent(int studId);
}
