package com.example.demo.modelclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity 
@Table(name="employe")
public class Employee {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="EID")
		private int eid;
	    @Column(name="ID")
	    private int id;
	    @NotNull(message = "Employee name cannot be null")
        @Column(name="EName")
		private String name;
        @Column(name="ESalary")
		private double salary;
        @Email(message = "Email should be valid")
        @Column(name="EemailID")
		private String emailId;
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		
		
}
