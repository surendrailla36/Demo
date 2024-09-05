package com.example.demo.service;

import java.util.List;

import com.example.demo.modelclass.Product;

public interface Productservice {
	
	public String saveProduct(Product product);
	public List <Product> getallproducts();
	public String updateProduct(Product product);
	public Product findByProductid(Integer eid);
	

}
