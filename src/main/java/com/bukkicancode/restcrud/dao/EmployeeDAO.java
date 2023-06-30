package com.bukkicancode.restcrud.dao;

import com.bukkicancode.restcrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
