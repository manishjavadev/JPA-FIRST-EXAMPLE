package com.manish.javadev.service;

import com.manish.javadev.model.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);

	Customer findCustomerById(int id);

}