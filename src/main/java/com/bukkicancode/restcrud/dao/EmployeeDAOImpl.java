package com.bukkicancode.restcrud.dao;

import com.bukkicancode.restcrud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;

    }
    @Override
    public List<Employee> findAll() {

        TypedQuery query = entityManager.createQuery("FROM Employee", Employee.class);
        List<Employee> employees= query.getResultList();
        return employees;
    }

    @Override
    public Employee getStudent(int studId) {
        Employee theEmployee = entityManager.find(Employee.class,studId);
        return theEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        entityManager.merge(employee);

        return employee;
    }

    @Override
    public void deleteStudent(int employeeId) {
        Employee theEmployee = entityManager.find(Employee.class,employeeId);
        entityManager.remove(theEmployee);
    }
}
