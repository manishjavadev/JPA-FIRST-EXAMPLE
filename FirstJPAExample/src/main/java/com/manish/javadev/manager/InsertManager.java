package com.manish.javadev.manager;

import com.manish.javadev.model.Customer;
import com.manish.javadev.service.CustomerService;
import com.manish.javadev.service.impl.CustomerServiceImpl;

public class InsertManager {
	public static void main(String args[]) {

		CustomerService customerService = new CustomerServiceImpl();

		Customer customer = new Customer("Manish", "Srivastava", 30);
		customer = customerService.saveCustomer(customer);
	}
}