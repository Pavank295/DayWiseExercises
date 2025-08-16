package com.example.service;
import com.example.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    Optional<Employee> findById(Long id);
    List<Employee> searchByName(String name);
    Employee save(Employee e, Long departmentId); 
    Employee update(Long id, Employee updated, Long departmentId);
    void delete(Long id);
}
