package com.example.customer.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.customer.DTO.CustomerDTO;
import com.example.customer.Repository.CustomerRepository;
import com.example.customer.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ModelMapper mapper;

	@Override
	public CustomerDTO getCustomerDetails(Integer customerId) {
		// TODO Auto-generated method stub
		Customer customer= customerRepository.findById(customerId).get();
		CustomerDTO customer1=mapper.map(customer,CustomerDTO.class);
		
//		CustomerDTO customer1=new CustomerDTO();
//		customer1.setCustomerId(customerId);
//		customer1.setCustomerName(customer1.getCustomerName());
//		customer1.setCustomerAddress(customer1.getCustomerAddress());
//		customer1.setPhoneNumber(customer1.getPhoneNumber());
		
		return customer1;
	}

}
