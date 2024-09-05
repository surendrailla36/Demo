package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.modelclass.Product;
import com.example.demo.repository.ProductRepository;
@Service
public class ProductServiceImpl implements Productservice{
	
	@Autowired
	ProductRepository productrepository;

	@Override
	public String saveProduct(Product product) {
		productrepository.save(product);
		return "Product Saved Succesfully";
	}

	@Override
	public List<Product> getallproducts() {
	return productrepository.findAll();
	}

	@Override
	public String updateProduct(Product product) {
		productrepository.save(product);
	       return "Product Updated Succesfully";
	}

	@Override
	public Product findByProductid(Integer eid) {
		Optional<Product> optProduct = productrepository.findById(eid);
		if(optProduct.isPresent()) {
		return optProduct.get();
		}
		else {
			throw new ProductNotFoundException("Product not found");
		}
	}

	
	

}
