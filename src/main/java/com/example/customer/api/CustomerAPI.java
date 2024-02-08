package com.example.customer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.DTO.CustomerDTO;
import com.example.customer.entity.Customer;
import com.example.customer.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerAPI {
	@Autowired
	private CustomerService customerService;
	@GetMapping(value="/customers/{customerId}")
	public ResponseEntity<CustomerDTO> getCustomerDetails(@PathVariable Integer customerId){
		
		CustomerDTO customer=customerService.getCustomerDetails(customerId);
		return new ResponseEntity<CustomerDTO>(customer,HttpStatus.OK);
	}

}
