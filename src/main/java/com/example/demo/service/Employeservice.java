package com.example.demo.service;

import java.util.List;

import com.example.demo.modelclass.Employee;

public interface Employeservice {

	public String saveEmploye(Employee employe);
	public List <Employee> getallEmployees(); 
	public String updateEmployee(Employee employe);
	public String deleteEmployee(Employee employe);
    public Employee findByEmployeeid(Integer eid);
	
}
