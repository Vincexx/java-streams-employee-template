package com.example.demo;

import java.text.ParseException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class DemoController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> list() throws ParseException {
        return employeeService.listOfEmployees();
    }

    @PostMapping("/employees")
    public Employee add(@RequestBody Employee employee) {
        return employee;
    }

}
