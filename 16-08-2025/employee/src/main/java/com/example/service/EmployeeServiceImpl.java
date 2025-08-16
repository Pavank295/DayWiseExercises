package com.example.service;
import com.example.exception.ResourceNotFoundException;
import com.example.model.Department;
import com.example.model.Employee;
import com.example.repository.DepartmentRepository;
import com.example.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository,
                               DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> searchByName(String name) {
        return (name == null || name.isBlank())
                ? employeeRepository.findAll()
                : employeeRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Employee save(Employee e, Long departmentId) {
        if (departmentId != null) {
            Department d = departmentRepository.findById(departmentId)
                    .orElseThrow(() -> new ResourceNotFoundException("Department not found: " + departmentId));
            e.setDepartment(d);
        } else {
            e.setDepartment(null);
        }
        return employeeRepository.save(e);
    }

    @Override
    public Employee update(Long id, Employee updated, Long departmentId) {
        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found: " + id));

        existing.setName(updated.getName());
        existing.setEmail(updated.getEmail());
        existing.setSalary(updated.getSalary());
        existing.setEmploymentType(updated.getEmploymentType());
        existing.setAddress(updated.getAddress());

        if (departmentId != null) {
            Department d = departmentRepository.findById(departmentId)
                    .orElseThrow(() -> new ResourceNotFoundException("Department not found: " + departmentId));
            existing.setDepartment(d);
        } else {
            existing.setDepartment(null);
        }
        return employeeRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        if (!employeeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Employee not found: " + id);
        }
        employeeRepository.deleteById(id);
    }
}
