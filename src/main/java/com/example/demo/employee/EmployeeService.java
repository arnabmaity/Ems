package com.example.demo.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	List<Employee> mylist= Arrays.asList(new Employee(3, "a", "Manager", "address"),
			new Employee(2, "b", "Employee", "address"));
			
	public List<Employee> getAllEmployees() {
		return mylist;
	}
	
	public Employee getEmployee(int id) {
		return mylist.stream().filter(t->t.getEmpId()==id).findFirst().get();
	}
}
