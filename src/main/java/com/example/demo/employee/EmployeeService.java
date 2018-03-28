package com.example.demo.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	List<Employee> mylist= new ArrayList<Employee>(Arrays.asList(new Employee(3, "a", "Manager", "address"),
			new Employee(2, "b", "Employee", "address")));
			
	public List<Employee> getAllEmployees() {
		ArrayList<Employee> arrayList= new ArrayList<>();
		
		employeeRepository.findAll().forEach(arrayList::add);
		return arrayList;
	}
	
	public Employee getEmployee(int id) {
		//return mylist.stream().filter(t->t.getEmpId()==id).findFirst().get();
		return employeeRepository.findOne(id);
	}
	
	public int addEmployee(Employee employee) {
		long count=employeeRepository.count();
		/*mylist.add(employee);
		if(mylist.size()== count+1) {
			return 1;
		}
		else {
			return 0;
		}*/
		employeeRepository.save(employee);
		if(employeeRepository.count()== count+1) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
