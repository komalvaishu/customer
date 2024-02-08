package com.example.customer.service;


import com.example.customer.DTO.CustomerDTO;
import com.example.customer.entity.Customer;

public interface CustomerService {
	public CustomerDTO getCustomerDetails(Integer customerId);
		
}
