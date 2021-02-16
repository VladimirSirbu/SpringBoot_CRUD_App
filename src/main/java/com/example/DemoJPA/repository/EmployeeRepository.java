package com.example.DemoJPA.repository;

import com.example.DemoJPA.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
