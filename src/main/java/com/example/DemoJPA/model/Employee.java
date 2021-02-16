package com.example.DemoJPA.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    @NotBlank(message = "First Name is required")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Last Name is required")
    private String lastName;

    @Column(name = "job_title")
    @NotNull(message = "Job Title is required")
    private JobTitle jobTitle;

}

