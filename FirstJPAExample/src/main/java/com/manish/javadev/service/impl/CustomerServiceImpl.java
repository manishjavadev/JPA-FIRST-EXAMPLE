package com.manish.javadev.service.impl;

import javax.persistence.EntityManager;

import com.manish.javadev.model.Customer;
import com.manish.javadev.service.CustomerService;
import com.manish.javadev.util.EntityManagerUtil;

public class CustomerServiceImpl implements CustomerService {
	public Customer saveCustomer(Customer customer) {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

	public Customer updateEmployee(Customer customer) {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

	public Customer findCustomerById(int id) {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();
		return entityManager.find(Customer.class, id);
	}

}