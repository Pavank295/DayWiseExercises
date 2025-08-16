package com.example.repository;
import com.example.model.Department;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Optional<Department> findById(int id);

	void deleteById(int id); }
