package com.example.demo;

import java.text.ParseException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class DemoController {

    private final EmployeeService employeeService;

    @GetMapping("/elastic-container-service")
    public String greetings() throws ParseException {
        return "Hello from AWS ECS!";
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() throws ParseException {
        return employeeService.listOfEmployees();
    }


}
