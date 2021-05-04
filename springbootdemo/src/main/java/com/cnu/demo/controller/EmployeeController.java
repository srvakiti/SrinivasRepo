package com.cnu.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnu.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/employess")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"cnu","reddy","cnu123@gmail.com"));
		employeesList.add(new Employee(2,"cnu2","reddy","cnu1234@gmail.com"));
		return employeesList;
    }

}
