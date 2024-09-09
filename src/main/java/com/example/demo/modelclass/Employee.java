package com.example.demo.modelclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
	    @Size(min = 2, max = 30, message = "Name must be between 2 and 30 characters")
        @Column(name="EName")
		private String ename;
        @Column(name="ESalary")
		private double esalary;
        @Email(message = "Email should be valid")
        @Column(name="EemailID")
		private String eemailId;
        @Column(name="eage")
        private int eage; 
        @Column(name="ESex")
        private String esex;
	
}
