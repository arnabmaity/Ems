package com.example.demo.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService myService;
	
	@RequestMapping("/hello")
	public String getmy(){
		
		return "Hello";
	}
	
	@RequestMapping("/employees")
	public java.util.List<Employee> getAllEmployees(){
		
		return myService.getAllEmployees();
	}
	
	@RequestMapping("/employees/{EmpId}")
	public Employee getEmployee(@PathVariable("EmpId") int id) {
		return myService.getEmployee(id);
		//return new Employee(2,"d","d","s");
	}
	
	@RequestMapping(method= RequestMethod.POST,value="/employees")
	public String addEmployee(@RequestBody Employee employee) {
		int success= myService.addEmployee(employee);
		if(success==1) {
			return "success";
		}
		else {
			return "failure";
		}
	}
}
