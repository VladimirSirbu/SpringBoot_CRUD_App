package com.example.DemoJPA.service;

import com.example.DemoJPA.model.Employee;
import com.example.DemoJPA.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll() {
       return employeeRepository.findAll();
    }

    public Employee findById(Integer id) {
        return employeeRepository.getOne(id);
    }

    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


}
