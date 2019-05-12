package com.example.MyEmployee.service;


import com.example.MyEmployee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Iterable<Employee> findAll();

    List<Employee> search(String q);

    Optional<Employee> findOne(int id);

    void save(Employee contact);

    void delete(int id);
}