package com.example.demo.employee;

public class Employee {

	
	private int empId;
	private String name;
	private String role;
	private String address;
	
	public Employee() {
		
	}
	
	
	public Employee(int empId, String name, String role, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.role = role;
		this.address = address;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
