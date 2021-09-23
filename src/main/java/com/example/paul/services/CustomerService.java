package com.example.paul.services;


import com.example.paul.models.Account;
import com.example.paul.models.Customer;
import com.example.paul.models.Transaction;
import com.example.paul.repositories.AccountRepository;
import com.example.paul.repositories.CustomerRepository;
import com.example.paul.repositories.TransactionRepository;
import com.example.paul.utils.CustomerInput;
import com.example.paul.utils.TransactionInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerrepository;
	
	public boolean addCustomer(CustomerInput customerinput) {
		var customer = new Customer();
		customer.setAadhar_no(customerinput.getAadhar_no());
		customer.setAadharcard(customerinput.getAadharcard());
		customer.setCust_id(customerinput.getCust_id());
		customer.setDob(customerinput.getDob());
		customer.setEmail(customerinput.getEmail());
		customer.setName(customerinput.getName());
		customer.setPan_no(customerinput.getPan_no());
		customer.setPancard(customerinput.getPancard());
		customer.setPostal_address(customerinput.getPostal_address());
		customer.setUser_id(customerinput.getUser_id());
		
		//System.out.println("hello"+customerinput.getAadhar_no());
		
		customerrepository.save(customer);
		return true;
	}
}
