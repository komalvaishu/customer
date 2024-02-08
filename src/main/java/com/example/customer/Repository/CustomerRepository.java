package com.example.customer.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>  {
Optional<Customer> findById(Integer customerId);
}
