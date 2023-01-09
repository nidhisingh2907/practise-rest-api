package com.demo.customer.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.customer.Model.Customer;
import com.demo.customer.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	//inbuilt func of JPA Repository
	//get all customers
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	//get customer by id
	public Optional<Customer> getCustomerById(Long id) {
		return customerRepository.findById(id);
	}
	
	//create a new customer
	public Customer createNewCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
}
