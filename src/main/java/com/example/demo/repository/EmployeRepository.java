package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelclass.Employee;

public interface EmployeRepository extends JpaRepository<Employee,Integer> {

}