package com.springboot.crud.cruddemo.repository;

import com.springboot.crud.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepo implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeRepo(EntityManager eM){
        entityManager = eM;
    }

    @Override
    public List<Employee> findAll() {

        //create a query - this "grabs" the database Employee table
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);

        // here we execute query we want i.e. "on the Employee table, get all the results"
        List<Employee> employees = query.getResultList();

        System.out.println(employees);
        // return the results
        return employees;
    }
}
