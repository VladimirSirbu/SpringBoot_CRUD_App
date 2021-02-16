package com.example.DemoJPA.controller;

import com.example.DemoJPA.model.Employee;
import com.example.DemoJPA.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

import com.example.DemoJPA.model.JobTitle;

@Controller
public class MainController {

    private final EmployeeService employeeService;

    @Autowired
    public MainController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String showEmployeeTable(Model model) {
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);
        return "employee-list";
    }

    @GetMapping("/employee-form")
    public String showNewEmployeeForm(Employee employee, Model model) {
        model.addAttribute("jobs", JobTitle.values());
        return "new-employee-form";
    }

    @PostMapping("/employee-create")
    public String createEmployee(@Valid Employee employee, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("jobs", JobTitle.values());
            return "new-employee-form";
        }

        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("edit-employee/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        model.addAttribute("jobs", JobTitle.values());
        return "edit-employee-form";
    }

    @PostMapping("/update-employee")
    public String updateEmployee(@Valid Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()){
            model.addAttribute("jobs", JobTitle.values());
            return "edit-employee-form";
        }
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

}
