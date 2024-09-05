package com.example.demo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.modelclass.ApiResponse;

@RestControllerAdvice
public class GlobleExceptionHandler {
	@ExceptionHandler(value = EmployeeNotFoundException.class)

	public ResponseEntity<ApiResponse> handleEmployeeNotFound(EmployeeNotFoundException exception){

		ApiResponse apiresponse = new ApiResponse();
		apiresponse.setStatuscode("9001");
		apiresponse.setStatusmessage(exception.getMessage());

		return new ResponseEntity<>(apiresponse,HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(value = ProductNotFoundException.class)
	
	public ResponseEntity<ApiResponse> handleProductNotFound(ProductNotFoundException exception){
		ApiResponse apiresponses = new ApiResponse();
		apiresponses.setStatuscode("9002");
		apiresponses.setStatusmessage(exception.getMessage());
		
		return new ResponseEntity<>(apiresponses,HttpStatus.NOT_FOUND);
		
	
	}
	@ResponseStatus(HttpStatus.BAD_REQUEST) @ExceptionHandler(MethodArgumentNotValidException.class) 
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) { 
		Map<String, String> errors = new HashMap<>(); 
		ex.getBindingResult().getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage())); 
		return errors; 
		}
               
}
