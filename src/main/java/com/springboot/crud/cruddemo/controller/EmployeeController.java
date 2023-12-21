package com.springboot.crud.cruddemo.controller;

import com.springboot.crud.cruddemo.entity.Employee;
import com.springboot.crud.cruddemo.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeDAO dao;

    // constructor
    @Autowired
    public EmployeeController(EmployeeDAO repo){
        dao = repo;
    }

    // get all Employees endpoint
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return dao.findAll();
    };
}
