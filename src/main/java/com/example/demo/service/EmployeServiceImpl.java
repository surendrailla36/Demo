package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.modelclass.Employee;
import com.example.demo.repository.EmployeRepository;
@Service
public class EmployeServiceImpl implements Employeservice {

	@Autowired
	EmployeRepository employeRepository;
	
	@Override
	public String saveEmploye(Employee employe) {
		employeRepository.save(employe);
		return "Employe saved Sucessfully";
	}


	@Override
	public List<Employee> getallEmployees() {
		return employeRepository.findAll();
	}


	@Override
	public String updateEmployee(Employee employe) {
		employeRepository.save(employe);
	    return "Employe Updated Sucessfully";
	}


	@Override
	public String deleteEmployee(Employee employe) {
	    employeRepository.delete(employe);
		return "Employe deleted Sucessfully";
	}


	@Override
	public Employee findByEmployeeid(Integer eid) {
        Optional<Employee> optEmployee = employeRepository.findById(eid);
		if(optEmployee.isPresent()){
			return optEmployee.get();
		}
		else {
			throw new EmployeeNotFoundException("Employee not found");
		}
	}
	}