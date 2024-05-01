package com.example.demo.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private int age;
    private double salary;
    private List<String> skills;
    private Map<String, String> contactInfo;
    private Date hireDate;
    private boolean isActive;
}
