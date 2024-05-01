package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeService {
    
    public List<Employee> listOfEmployees() throws ParseException {
        List<Employee> employees = new ArrayList<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Employee emp1 = new Employee("John Doe", 30, 50000.0,
                Arrays.asList("Java", "Python", "SQL"),
                getContactInfo("john.doe@example.com", "1234567890"),
                dateFormat.parse("01/04/2020"), true);
        employees.add(emp1);

        Employee emp2 = new Employee("Alice Smith", 34, 60000.0,
                Arrays.asList("JavaScript", "HTML", "CSS"),
                getContactInfo("alice.smith@example.com", "9876543210"),
                dateFormat.parse("12/01/2018"), true);
        employees.add(emp2);

        Employee emp3 = new Employee("Robert Johnson", 28, 45000.0,
                Arrays.asList("C++", "Python", "Data Analysis"),
                getContactInfo("robert.johnson@example.com", "4567890123"),
                dateFormat.parse("15/07/2019"), false);
        employees.add(emp3);

        Employee emp4 = new Employee("Emily Brown", 32, 55000.0,
                Arrays.asList("Java", "JavaScript", "Angular"),
                getContactInfo("emily.brown@example.com", "7890123456"),
                dateFormat.parse("05/03/2017"), true);
        employees.add(emp4);

        Employee emp5 = new Employee("Michael Wilson", 29, 52000.0,
                Arrays.asList("Python", "Machine Learning", "Big Data"),
                getContactInfo("michael.wilson@example.com", "2345678901"),
                dateFormat.parse("20/11/2018"), true);
        employees.add(emp5);

        Employee emp6 = new Employee("Olivia Davis", 31, 48000.0,
                Arrays.asList("HTML", "CSS", "UI/UX Design"),
                getContactInfo("olivia.davis@example.com", "6789012345"),
                dateFormat.parse("02/09/2019"), true);
        employees.add(emp6);

        Employee emp7 = new Employee("James Miller", 33, 58000.0,
                Arrays.asList("Java", "Spring Framework", "Hibernate"),
                getContactInfo("james.miller@example.com", "8901234567"),
                dateFormat.parse("14/06/2020"), true);
        employees.add(emp7);

        Employee emp8 = new Employee("Sophia Wilson", 27, 43000.0,
                Arrays.asList("Python", "Data Science", "Data Visualization"),
                getContactInfo("sophia.wilson@example.com", "4567890123"),
                dateFormat.parse("23/02/2021"), true);
        employees.add(emp8);

        Employee emp9 = new Employee("Liam Anderson", 35, 62000.0,
                Arrays.asList("Java", "Spring Boot", "Microservices"),
                getContactInfo("liam.anderson@example.com", "6789012345"),
                dateFormat.parse("17/10/2017"), false);
        employees.add(emp9);

        Employee emp10 = new Employee("Ava Lee", 28, 51000.0,
                Arrays.asList("JavaScript", "React", "Node.js"),
                getContactInfo("ava.lee@example.com", "9012345678"),
                dateFormat.parse("29/12/2018"), true);
        employees.add(emp10);

        Employee emp11 = new Employee("Mason Harris", 30, 54000.0,
                Arrays.asList("Python", "Machine Learning", "Natural Language Processing"),
                getContactInfo("mason.harris@example.com", "3456789012"),
                dateFormat.parse("16/08/2019"), true);
        employees.add(emp11);

        Employee emp12 = new Employee("Isabella Martinez", 29, 47000.0,
                Arrays.asList("HTML", "CSS", "Bootstrap"),
                getContactInfo("isabella.martinez@example.com", "7890123456"),
                dateFormat.parse("25/05/2020"), true);
        employees.add(emp12);

        Employee emp13 = new Employee("William Wilson", 31, 60000.0,
                Arrays.asList("Java", "Spring MVC", "RESTful APIs"),
                getContactInfo("william.wilson@example.com", "1234567890"),
                dateFormat.parse("03/05/2017"), true);
        employees.add(emp13);

        Employee emp14 = new Employee("Charlotte Davis", 32, 52000.0,
                Arrays.asList("Python", "Data Analysis", "SQL"),
                getContactInfo("charlotte.davis@example.com", "5678901234"),
                dateFormat.parse("22/11/2018"), false);
        employees.add(emp14);

        Employee emp15 = new Employee("Benjamin Taylor", 34, 58000.0,
                Arrays.asList("JavaScript", "React Native", "Firebase"),
                getContactInfo("benjamin.taylor@example.com", "9012345678"),
                dateFormat.parse("11/07/2019"), true);
        employees.add(emp15);

        return employees;
            
    }

    private static Map<String, String> getContactInfo(String email, String phone) {
        Map<String, String> contactInfo = new HashMap<>();
        contactInfo.put("Email", email);
        contactInfo.put("Phone", phone);
        return contactInfo;
    }

}
