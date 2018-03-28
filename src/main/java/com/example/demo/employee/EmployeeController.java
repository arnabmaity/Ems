package com.example.demo.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	@RequestMapping("/hello")
	public String getmy(){
		
		return "Hello";
	}
	
	@RequestMapping("/employees")
	public java.util.List<Employee> getAllEmployees(){
		
		return Arrays.asList(new Employee(1, "a", "Manager", "address"),
				new Employee(1, "a", "Manager", "address"));
	}
}
