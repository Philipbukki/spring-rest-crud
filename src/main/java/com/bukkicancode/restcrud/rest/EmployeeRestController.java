package com.bukkicancode.restcrud.rest;

import com.bukkicancode.restcrud.dao.EmployeeDAO;
import com.bukkicancode.restcrud.entity.Employee;
import com.bukkicancode.restcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;

    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
        List<Employee> employees = employeeService.findAll();
        return employees;
    }
}
