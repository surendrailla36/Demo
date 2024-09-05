package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelclass.Employee;
import com.example.demo.service.Employeservice;

import jakarta.validation.Valid;

@RestController

public class Employecontroler {
@Autowired
Employeservice employeservice;

	@GetMapping("/greet")
public String greeting() {
    return "Hello - RESTFul webservices";

}

@PostMapping("/employe")
public String saveEmployee(@Valid @RequestBody Employee employe){
	return employeservice.saveEmploye(employe);

}

@GetMapping("/employees")
public List <Employee> getallEmployee(){
	return employeservice.getallEmployees();	
}
@PutMapping("/employees")
public String saveEmploye(@RequestBody Employee employe) {
       return employeservice.saveEmploye(employe);	
}

@DeleteMapping("/employees")
public String deleteEmployee(@RequestBody Employee employe){
             return employeservice.deleteEmployee(employe);
             
}
@PostMapping("/employees/{eid}")
public Employee findByEmployeeid(@PathVariable Integer eid) {
        return employeservice.findByEmployeeid(eid);      

}
}
