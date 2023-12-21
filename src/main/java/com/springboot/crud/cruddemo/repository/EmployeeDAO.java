package com.springboot.crud.cruddemo.repository;

import com.springboot.crud.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
