package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.modelclass.Employee;
import com.example.demo.modelclass.Product;
import com.example.demo.service.Productservice;

import jakarta.validation.Valid;
@RestController
public class ProductControler {

@Autowired
Productservice productservice;

@GetMapping("/greet1")
public String greeting() {
    return "Hello - RESTFul webservices";
}

@PostMapping("/product")
public String saveProduct( @Valid @RequestBody Product product) {
	
	return productservice.saveProduct(product);
}

@GetMapping("/allproducts")
public List <Product> getallProducts(){
	return productservice.getallproducts();

}
@PutMapping("/Updateproduts")
public String saveProducts(@RequestBody Product product) {
	return productservice.updateProduct(product);
	}
@PostMapping("/findproduct/{pid}")
public Product findByProductid(@PathVariable Integer pid) {
        return productservice.findByProductid(pid); 
}
}