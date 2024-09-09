package com.example.demo.modelclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="product")
public class Product {
	    @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="EID")
        private int eid;
	    @Column(name="PID")
	    private int pid;
	    @NotNull(message = "Product name cannot be null")
	    @Size(min = 2, max = 30, message = "Name must be between 2 and 30 characters")
	    @Column(name="PName")
	    private String pname;
	    @Column(name="PPrice")
	    private float pprice;
	    @Max(value = 10, message = "quantity should not exceed more then 10") 
	    @Column(name="PQuantity")
	    private int pquantity;
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public float getPprice() {
			return pprice;
		}
		public void setPprice(float pprice) {
			this.pprice = pprice;
		}
		public int getPquantity() {
			return pquantity;
		}
		public void setPquantity(int pquantity) {
			this.pquantity = pquantity;
		}
	   
	    
}
