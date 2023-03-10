package com.demo.customer.Controller;

import java.util.List;
//import javax.validation.Valid;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.demo.customer.Exception.*;
import com.demo.customer.Model.Customer;
import com.demo.customer.Service.CustomerService;
import org.springframework.web.bind.MethodArgumentNotValidException;

@RestController
public class CustomersController {

	@Autowired
	private CustomerService customerService;
	
	//Get all Customers
	@GetMapping("/Customers") //endpoint
	//Returns a list of Customers - return type: List
	public List<Customer> getAllCustomers(){
		List<Customer> Customers=customerService.getAllCustomers();
		if(Customers.isEmpty()){
			throw new ResourceNotFoundException("No Customer Found.");
		}
		return Customers;
	}
	
	//Get Customers by Id
	@GetMapping("/Customers/{id}")
	public Customer getCustomerById(@PathVariable("id") Long id) {
		return customerService.getCustomerById(id).orElseThrow(()->new ResourceNotFoundException("No Customer found for Id: "+id));
	}
	
	//Create a new Customer
	@PostMapping("/Customers")
	public Customer createCustomer( @RequestBody Customer customer) {
		return customerService.createNewCustomer(customer);
	 
	}
	
}
