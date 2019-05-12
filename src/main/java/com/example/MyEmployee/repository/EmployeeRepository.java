package com.example.MyEmployee.repository;

import com.example.MyEmployee.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee,Integer> {

    List<Employee> findByName(String name);
}
