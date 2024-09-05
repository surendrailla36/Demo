package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelclass.Employee;

public interface EmployeRepository extends JpaRepository<Employee,Integer> {

	List<Employee> findAll();
	

}